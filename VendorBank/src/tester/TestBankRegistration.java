package tester;

import static utils.HibernatUtils.*;

import java.util.Scanner;

import org.hibernate.*;

import dao.VendorDaoImpl;
import pojos.Bank;
import pojos.Vendor;
public class TestBankRegistration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	try(SessionFactory sf=getSf()){	
System.out.println("Enter Bank Account Details");
System.out.println("Enter VendorId AccountType Balance ");

System.out.println(new VendorDaoImpl().registerBankAccount(sc.nextInt(),new Bank(sc.next(),sc.nextDouble())));
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}

}
