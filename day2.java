package testng1;

import org.testng.annotations.Test;

public class day2 {
	@Test
	public void weblogin()
	{
		System.out.println("class is  day2 and method is weblogin");
		
	}
	@Test(enabled=false)
	public void weblogout()
	{
		System.out.println("class is  day2 and method is weblogout");
		
	}
	@Test(groups= {"socialsite"})
	public void twitter()
	{
		System.out.println("class is  day3 and method is twitter");
		
	}
	@Test(groups= {"socialsite"})
	public void sharechat()
	{
		System.out.println("class is  day3 and method is sharechat");
		
	}
	@Test(groups= {"socialsite"})
	public void skype1()
	{
		System.out.println("class is  day3 and method is skype1");
		
	}

}
