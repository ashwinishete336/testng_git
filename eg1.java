package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class eg1 {

	@Test     //testcase
	public void google()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void Quickyes()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://quickyes.in/");
	}
	
	}
	

