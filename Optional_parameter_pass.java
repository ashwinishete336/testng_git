package testng1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optional_parameter_pass {
	
	WebDriver driver;
	
	
  @Test
  public void openbrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\webdriver\\chromedriver.exe");
		 driver=new ChromeDriver();
  }
  @Test(dependsOnMethods= {"openbrowser"})
  public void EnterUrl()
  {
	  driver.get("http://www.demo.guru99.com/test/delete_customer.php");
  }
  @Test(dependsOnMethods= {"openbrowser","EnterUrl"})
  @Parameters({"val1"})
  public void datatitle(@Optional("default")String name)
  {
	  driver.findElement(By.name("cusid")).sendKeys(name);
		driver.findElement(By.name("submit")).submit();
  }
  @Test(dependsOnMethods= {"openbrowser","EnterUrl","datatitle"})
  
  public void taskcomplete() throws InterruptedException
  {
	  Alert alert=driver.switchTo().alert();
		String s=driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println(s);
  }
}
