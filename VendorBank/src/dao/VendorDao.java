package dao;

import pojos.Bank;
import pojos.Vendor;

public interface VendorDao {
public String vendorRegistration(Vendor v);

public Vendor displayVendor(int id );

public String registerBankAccount(int id,Bank b);
}
