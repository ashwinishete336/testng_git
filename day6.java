package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day6 {

	WebDriver driver;
	
	
	  @Test
	  public void a() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\webdriver\\chromedriver.exe");
			 driver=new ChromeDriver();
	  }
	  @Test
	  public void b()
	  {
		  driver.get("https://www.facebook.com");
	  }
	  @Test(dataProvider="credentials")
	  public void c(String name,String passward)
	  {
		  driver.findElement(By.id("email")).sendKeys(name);
			driver.findElement(By.id("pass")).sendKeys(passward);
	  }
	  @Test
	  public void d()
	  {
		  System.out.println("dataprocessing working");
		  
	  }
	  
	  @Test
	  public void e()
	  {
		  System.out.println("logout sucessfully");
		  
	  }
	  @DataProvider(name="credentials")
	  
	  public Object[][] getdata()
	  {
	  Object[][] data =new Object[3][2];
	  data[0][0]="first user";
	  data[0][1]="first passward";
	  data[1][0]="second user";
	  data[1][1]="second passward";
	  data[2][0]="third user";
	  data[2][1]="third passward";
	  
	  return data;
	  
	  }
	  
	  
	  
}
