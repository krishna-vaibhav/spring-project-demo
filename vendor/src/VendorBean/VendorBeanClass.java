package VendorBean;

import java.util.List;

import dao.VendorDaoImp;
import pojos.Vendor;

public class VendorBeanClass {

	
	private Vendor vendorDetails;
	private VendorDaoImp dao;
	
	
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
	
}
