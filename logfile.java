package testng1;

import org.testng.Reporter;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logfile {
	@Test(priority=-1)
	  public void facebook() {
		  System.out.println("working on facewook");
		 // Reporter.log("facebook task completed");
	  
	  }

	 @Test(priority=0)
	  public void google() {
		  System.out.println("working on google");
		 // Reporter.log("google task completed");
	  
	  }
	 @Test
	  public void amazon() {
		  System.out.println("working on amazon");
		  Reporter.log("amazon task completed");
	  
	  }
	 @Test(priority=1)
	  public void guru99() {
		  System.out.println("working on guru99");
		  Reporter.log("guru99 task completed",false);
	  }

}
