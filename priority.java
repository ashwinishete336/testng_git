package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class priority {
	 @Test(priority=-1)
	  public void facebook() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\webdriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.get("https://www.facebook.com");
	  }

	 @Test(priority=0)
	  public void google() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\webdriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.get("https://www.google.com");
	  }
	 @Test
	  public void amazon() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\webdriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
	  }
	 @Test(priority=1)
	  public void guru99() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\webdriver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.demo.guru99.com/test/delete_customer.php");
	  }

}
