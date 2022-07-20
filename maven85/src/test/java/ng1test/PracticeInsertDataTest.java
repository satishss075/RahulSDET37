package ng1test;

import org.testng.annotations.Test;

public class PracticeInsertDataTest {

	@Test
	public  void GetValueTest() 
	{
		String username = System.getProperty("USERNAME");
		String password = System.getProperty("PASSWORD");
		String browser = System.getProperty("BROWSER");
		
		System.out.println("USERNAME"+ "   equal to "  + " is " + username);
		System.out.println("PASSWORD" + "  equal to " + " " + " is " + password );
		System.out.println("BROWSER" + " equal to "  + " is " + browser);

	}

}
