package tester;
import static utils.HibernatUtils.*;

import org.hibernate.*;
public class TestUtil {

	public static void main(String[] args) {
	
		try(SessionFactory sf=getSf())
		{
			System.out.println("hibernate booted");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
