package Demoshop;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
@Listeners(testlistner.Testlistner.class)
public class Test1 {
	WebDriver driver;
	
	@BeforeSuite
	  public void beforeSuite() 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\New folder\\New folder\\chromedriver_win32\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.manage().window().maximize();
	  }
	
	
  @Test
  public void testclass() 
  {
	  driver.get("http://demowebshop.tricentis.com/register");
	  registerdemo rg=new registerdemo(driver);
	  rg.setgender();
	  rg.setcmfmpassword();
	  rg.setemail();
	  rg.setfirstname();
	  rg.setlastname();
	  rg.setpassword();
	  rg.register();
	  
	  
	  
  }
  

}
