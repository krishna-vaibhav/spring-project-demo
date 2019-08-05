package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.ShareMarket;

@Controller
@RequestMapping("/bank")
public class RestClntAccountController {

	@GetMapping("/fetch_summary")
	public String showSummaryForm() {
		System.out.println("in show summary form");
		return "/bank/fetch_summary";
	}

	@PostMapping("/fetch_summary")
	public String processSummaryForm(@RequestParam double min, @RequestParam String max, RestTemplate template,
			RedirectAttributes flashMap) {
		String url = "http://localhost:7070/day12_rest_server/share_m/{min}/{max}";
		System.out.println("in process summary form " + min + " " + max);
		// invoke REST server API to fetch a/c summary
		ShareMarket a = null;
		try {
			a = template.getForObject(url, ShareMarket.class, min, max);
			flashMap.addFlashAttribute("mesg", "Share Details "+a);
			
		} catch (RestClientException e) {
			System.out.println("err in rest clnt " + e);
			flashMap.addFlashAttribute("mesg",e.getMessage());
		}
		return "redirect:/vendor/details";
	}

}
