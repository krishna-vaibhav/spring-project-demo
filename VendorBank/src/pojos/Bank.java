package pojos;

import javax.persistence.*;

@Entity
@Table(name="bank",schema="system")
public class Bank {
private String type;
private double balance;
private Integer id;
private Vendor vendor;

public Bank()
{
	System.out.println("Inside bank constr");
}






public Bank(String type, double balance, Integer id, Vendor vendor) {
	super();
	this.type = type;
	this.balance = balance;
	this.id = id;
	this.vendor = vendor;
}






public Bank(String type, double balance) {
	super();
	this.type = type;
	this.balance = balance;
	
}

@Column(length=10)
public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Column(length=10)
public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="b_id")
public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

@Override
public String toString() {
	return "Bank [type=" + type + ", balance=" + balance + ", id=" + id + "]";
}


@ManyToOne
@JoinColumn(name="id")
public Vendor getVendor() {
	return vendor;
}



public void setVendor(Vendor vendor) {
	this.vendor = vendor;
	
}



}
