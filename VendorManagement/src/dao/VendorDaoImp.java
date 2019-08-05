package dao;


import static utils.HibernateUtils.*;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import pojos.Bank;
import pojos.Vendor;

public class VendorDaoImp implements VendorDao{

	@Override
	public List<Vendor> getAllVendor() {
		System.out.println("inside getAllVendor");
		List<Vendor> l1=null;
		String jpql="select v from Vendor v";
		
		Session hs=getSf().getCurrentSession();
		
		Transaction tx=hs.beginTransaction();
		
		try{
			
			l1=hs.createQuery(jpql,Vendor.class).getResultList();
			
			tx.commit();
			
		}catch(HibernateException e)
		{
			if(tx != null)
				tx.rollback();
			throw e;
		}
		
		return l1;
	}




public String registerVendor(String name, String email, String city, String phoneno) {
	Session hs=getSf().getCurrentSession();
	
	Transaction tx=hs.beginTransaction();
	
	try
	{
	hs.save(new Vendor(name,email,city,phoneno));	
	tx.commit();
	}catch(HibernateException e)
	{
		if(tx != null)
			tx.rollback();
		throw e;
	}
	return "list";
}
	
public	String deleteVendor(int id)

	{
	
	Session hs=getSf().getCurrentSession();
	     Transaction tx=hs.beginTransaction();
	     try{
	    	Vendor v=hs.get(Vendor.class,id);
	    	if(v != null)
	    	{
	    		hs.delete(v);
	    	}
	    	tx.commit();
	     }catch(HibernateException e)
	     {
	    	 if(tx != null)
	    	 {
	    		 tx.rollback();
	    		 throw e;
	    	 }
	     }
	     return "list";
		
	
	}

public Vendor vendorFetchById(int id)
{   
	
		System.out.println("inside fetch by id");
		Vendor l1=null;
		String jpql="select v from Vendor v where v.id=:vid";
		
		Session hs=getSf().getCurrentSession();
		
		Transaction tx=hs.beginTransaction();
		
		try{
			
			l1= hs.createQuery(jpql,Vendor.class).setParameter("vid",id).getSingleResult();
			
			tx.commit();
			
		}catch(HibernateException e)
		{
			if(tx != null)
				tx.rollback();
			throw e;
		}
		
		return l1;
	
 
}


public String updateExistVendor(String name,String city,String phoneno)
{
	System.out.println("Inside update exist");
	String jpql="update Vendor v set v.city=:ct and v.phoneno=:ph where v.name=:vname";

	Session hs=getSf().getCurrentSession();
	Transaction tx=hs.beginTransaction();
	try{
		hs.createQuery(jpql).setParameter("vname",name).setParameter("ct",city).setParameter("ph",phoneno).executeUpdate();
		
		tx.commit();
	}catch(HibernateException e)
	{
		if(tx != null)
		{
			tx.rollback();
			throw e;
		}
	}
	
	return "list";
}
	

public String registerBankAccount(int id,Bank b) {
	String msg="";
   Vendor v=null;
	Session hs=getSf().getCurrentSession();
	Transaction tx=hs.beginTransaction();
	try{
		v=hs.get(Vendor.class,id);
		if(v != null)
			v.addAccount(b);
	
		tx.commit();
	}catch (HibernateException e) {
		if(tx != null)
			tx.rollback();
		throw e;
	}
	return msg;
}

public List<Bank> getAllBank(int id) {
	System.out.println("inside getAllBank");
	List<Bank> l1=null;
	String jpql="select b from Bank b where b.id=:vid";
	
	Session hs=getSf().getCurrentSession();
	
	Transaction tx=hs.beginTransaction();
	
	try{
		
		l1=hs.createQuery(jpql,Bank.class).setParameter("vid",id).getResultList();
		
		tx.commit();
		
	}catch(HibernateException e)
	{
		if(tx != null)
			tx.rollback();
		throw e;
	}
	
	return l1;
}



}
