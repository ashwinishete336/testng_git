package testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day4 {
	
	WebDriver driver;
	
	
  @Test
  public void openbrowser() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\webdriver\\chromedriver.exe");
		 driver=new ChromeDriver();
  }
  @Test(dependsOnMethods= {"openbrowser"})
  public void EnterUrl()
  {
	  driver.get("https://book.spicejet.com/");
  }
  @Test(dependsOnMethods= {"openbrowser","EnterUrl"})
  public void datatitle()
  {
	  System.out.println(driver.getTitle());
  }
}
