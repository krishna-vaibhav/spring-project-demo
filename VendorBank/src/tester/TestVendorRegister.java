package tester;
import static utils.HibernatUtils.*;

import java.util.Scanner;

import org.hibernate.*;

import dao.VendorDaoImpl;
import pojos.Vendor;
public class TestVendorRegister {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
	
	try(SessionFactory sf=getSf()){
		System.out.println("Add Vendor Details.....");
		System.out.println("Name,Email,City,Phone Number");
		Vendor v=new Vendor(sc.next(),sc.next(),sc.next(),sc.next());
		System.out.println(new VendorDaoImpl().vendorRegistration(v));
	}catch(Exception e)
	{ 
		e.printStackTrace();
	}
		
		
	}

}
