package testng1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@BeforeSuite
	public void mobilelogin()
	{
		System.out.println("class is  day1 and method is mobilelogin");
		
	}
	@AfterSuite
	public void mobilelogout()
	{
		System.out.println("class is  day1 and method is mobilelogout");
		
	}
	@Test(groups= {"socialsite"})
	public void whtsapp()
	{
		System.out.println("class is  day1 and method is whtsapp");
		
	}
	@Test(groups= {"socialsite"})
	public void instagram()
	{
		System.out.println("class is  day1 and method is instagram");
		
	}
	@Test(groups= {"socialsite"})
	public void facebook()
	{
		System.out.println("class is  day1 and method is facebook");
		
	}
	
}
