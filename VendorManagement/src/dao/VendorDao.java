package dao;

import java.util.List;

import pojos.Bank;
import pojos.Vendor;

public interface VendorDao {
List<Vendor> getAllVendor();
String registerVendor(String name, String email, String city, String phoneno);
String deleteVendor(int id);
Vendor vendorFetchById(int id);
String updateExistVendor(String name,String city,String phoneno);
public String registerBankAccount(int id,Bank b);
public List<Bank> getAllBank(int id);
}
