package com.app.pojos;

import java.util.Date;

import javax.persistence.*;


public class ShareMarket {
	
	private int id;
	private String companyName;
	private Date publishDate;
	private double price;
	
	
	public ShareMarket(int id, String companyName, Date publishDate, double price) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.publishDate = publishDate;
		this.price = price;
	}

   
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	public String getCompanyName() {
		return companyName;
	}

	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public Date getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	
	public String toString() {
		return "ShareMarket [id=" + id + ", companyName=" + companyName + ", publishDate=" + publishDate + ", price="
				+ price + "]";
	}
	
	
	

}
