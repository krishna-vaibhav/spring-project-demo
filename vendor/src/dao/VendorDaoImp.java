package dao;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static Util.DBUtil.getConnection;
import pojos.Vendor;

public class VendorDaoImp implements VendorDao{
	
	private Connection cn;
	private PreparedStatement pst1;
	Statement st;
	String s1="";
	public VendorDaoImp()throws Exception
	{
         cn=getConnection();
	 s1="select * from vendor";
		st=cn.createStatement();
	}
	
	
	
	
	public List<Vendor> getAllVendor()throws Exception
	{System.out.println("dao aaya");
		ArrayList<Vendor> ls=new ArrayList<>();
		try(ResultSet result=st.executeQuery(s1))
		{System.out.println("dao or aaya");
			while(result.next())
			{System.out.println("dao or andar aaya");
				ls.add(new Vendor(result.getString(1),result.getString(2),result.getString(3),result.getString(4)));
				System.out.println(ls);
				System.out.println("dao  jaaaya");
			}
			

		}
	
		return ls;
		
	}
	
	
	public void cleanUp()throws Exception
	{
		if(pst1 != null)
			pst1.close();
		if(cn != null)
			cn.close();
	}

}
