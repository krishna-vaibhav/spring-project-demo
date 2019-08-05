package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="share_table")
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

     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Column(length=20,name="c_name")
	public String getCompanyName() {
		return companyName;
	}

	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="p_date")
	public Date getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	@Column(length=5)
	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "ShareMarket [id=" + id + ", companyName=" + companyName + ", publishDate=" + publishDate + ", price="
				+ price + "]";
	}
	
	
	

}
