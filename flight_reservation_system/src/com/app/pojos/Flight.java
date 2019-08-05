package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name="flight_table",schema="system")
public class Flight {
	private Integer flightNo;
private String from,to,departDate,returnDate,travelClass,roundTrip;
private Integer noFSeats,totalNofSeat;
private double price;


public Flight() {
	System.out.println("Inside flight constr");
}


public Flight(String from, String to, String departDate, String returnDate, String travelClass, String roundTrip,
		Integer noFSeats) {
	super();
	this.from = from;
	this.to = to;
	this.departDate = departDate;
	this.returnDate = returnDate;
	this.travelClass = travelClass;
	this.roundTrip = roundTrip;
	this.noFSeats = noFSeats;
}

@Id
@Column(length=5)
public Integer getFlightNo() {
	return flightNo;
}


public void setFlightNo(Integer flightNo) {
	this.flightNo = flightNo;
}

@Column(length=15)
public String getFrom() {
	return from;
}


public void setFrom(String from) {
	this.from = from;
}

@Column(length=15)
public String getTo() {
	return to;
}


public void setTo(String to) {
	this.to = to;
}

@Temporal(TemporalType.DATE)
@Column(name="d_date",length=15)
public String getDepartDate() {
	return departDate;
}


public void setDepartDate(String departDate) {
	this.departDate = departDate;
}

@Temporal(TemporalType.DATE)
@Column(name="d_date",length=15)
public String getReturnDate() {
	return returnDate;
}


public void setReturnDate(String returnDate) {
	this.returnDate = returnDate;
}

@Column(length=10)
public String getTravelClass() {
	return travelClass;
}


public void setTravelClass(String travelClass) {
	this.travelClass = travelClass;
}

@Column(length=5)
public String getRoundTrip() {
	return roundTrip;
}


public void setRoundTrip(String roundTrip) {
	this.roundTrip = roundTrip;
}


public Integer getNoFSeats() {
	return noFSeats;
}


public void setNoFSeats(Integer noFSeats) {
	this.noFSeats = noFSeats;
}


public Integer getTotalNofSeat() {
	return totalNofSeat;
}


public void setTotalNofSeat(Integer totalNofSeat) {
	this.totalNofSeat = totalNofSeat;
}



public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


@Override
public String toString() {
	return "Flight [flightNo=" + flightNo + ", from=" + from + ", to=" + to + ", departDate=" + departDate
			+ ", returnDate=" + returnDate + ", travelClass=" + travelClass + ", roundTrip=" + roundTrip + ", noFSeats="
			+ noFSeats + ", totalNofSeat=" + totalNofSeat + ", price=" + price + "]";
}








}
