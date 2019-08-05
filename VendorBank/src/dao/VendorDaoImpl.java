package dao;
import static utils.HibernatUtils.getSf;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Bank;
import pojos.Vendor;

public class VendorDaoImpl implements VendorDao{

	@Override
	public String vendorRegistration(Vendor v) {
		Session hs=getSf().getCurrentSession();
		Transaction tx=hs.beginTransaction();
		try{
			hs.save(v);
			tx.commit();
		}catch (HibernateException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return "vendor registered successfully";
	}

	
	public Vendor displayVendor(int id) {
		Vendor v=null;
		//String jpql="select v from Vendor where v.id=:id";
		Session hs=getSf().getCurrentSession();
		Transaction tx=hs.beginTransaction();
		try{
		  v =  hs.get(Vendor.class,id);
			tx.commit();
		}catch (HibernateException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return v;
	}


	
	public String registerBankAccount(int id,Bank b) {
		String msg="Bank Account registered successfully";
       Vendor v=null;
		Session hs=getSf().getCurrentSession();
		Transaction tx=hs.beginTransaction();
		try{
			v=hs.get(Vendor.class,id);
			if(v != null)
				v.addAccount(b);
			else
			{
				msg="invalid id";
			}
			tx.commit();
		}catch (HibernateException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}
		return msg;
	}

	
	
	
}
