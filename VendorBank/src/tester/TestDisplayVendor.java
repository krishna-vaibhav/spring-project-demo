package tester;
import static utils.HibernatUtils.*;

import java.util.Scanner;

import org.hibernate.*;

import dao.VendorDaoImpl;

public class TestDisplayVendor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(SessionFactory sf=getSf())
		{
			System.out.println("Enter Id Vendor");
			System.out.println(new VendorDaoImpl().displayVendor(sc.nextInt()));
			 
			 
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
