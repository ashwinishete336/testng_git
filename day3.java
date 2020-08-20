package testng1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
	@AfterTest
	public void APIlogin()
	{
		System.out.println("class is  day3 and method is APIlogin");
		
	}
	@BeforeTest
	public void APIlogout()
	{
		System.out.println("class is  day3 and method is APIlogout");
		
	}
	@Test(dependsOnGroups= {"socialsite"})
	public void data()
	{
		System.out.println("class is  day3 and method is data");
		
	}
	@Test(groups= {"socialsite"})
	public void hike()
	{
		System.out.println("class is  day3 and method is hike");
		
	}
	@Test(groups= {"socialsite"})
	public void skype()
	{
		System.out.println("class is  day3 and method is skype");
		
	}
}
