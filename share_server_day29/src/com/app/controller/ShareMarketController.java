package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.ShareDao;
import com.app.pojos.ShareMarket;

    	@RestController
    	@RequestMapping("/share_m")
 public class ShareMarketController {
    	@Autowired
    	private ShareDao dao;
   
    	@GetMapping("/{min}/{max}")
     public List<ShareMarket> fetchShare(@PathVariable double min,@PathVariable double max)
     {
    		System.out.println("rest server fetch share"+min+" "+max);
    		return dao.getShare(min, max);
     }
	
	
}
