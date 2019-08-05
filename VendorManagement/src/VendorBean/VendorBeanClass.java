package VendorBean;

import java.util.List;

import dao.VendorDaoImp;
import pojos.Bank;
import pojos.Vendor;

public class VendorBeanClass {

	private String name,email,city,phoneno;
	private int id,bid;
	private Vendor vendorDetails;
	private VendorDaoImp dao;
	private String type;
	private double balance;
	
	
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		System.out.println("bean name"+this.name);
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		System.out.println(this.email);
		this.email = email;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		System.out.println(this.city);
		this.city = city;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		System.out.println(this.phoneno);
		this.phoneno = phoneno;
	}


	public VendorBeanClass()throws Exception
	{
		
	 dao=new VendorDaoImp();
	 System.out.println("Dao instance created");
	}


	public Vendor getVendorDetails() {
		return vendorDetails;
	}


	public void setVendorDetails(Vendor vendorDetails) {
		this.vendorDetails = vendorDetails;
	}


	public VendorDaoImp getDao() {
		return dao;
	}


	public void setDao(VendorDaoImp dao) {
		this.dao = dao;
	}
	
	public List<Vendor> helloVendor()throws Exception
	{
		System.out.println("running method");
		return dao.getAllVendor();
	}
	
	
	public String vendorRegister()throws Exception
	{System.out.println("running method");
	System.out.println(this.name);
	System.out.println(this.email);
	System.out.println(this.city);
	System.out.println(this.phoneno);
		return dao.registerVendor(name,email,city,phoneno);
	}
	
	
	public String unscribeVendor()throws Exception
	{
		System.out.println("inside delete bean");
		return dao.deleteVendor(id);
	}
	
	public Vendor fetchById()throws Exception
	{  System.out.println("Inside bean fetch by id");
		return dao.vendorFetchById(id);
	}
	
	
	public String updateVendor()throws Exception
	{
		return dao.updateExistVendor(name,city,phoneno);
	}
	
	public List<Bank> showAllAccount()
	{
		return dao.getAllBank(id);
	}
	
}
