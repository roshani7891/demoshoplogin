package Demo99;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class NewTest {
  WebDriver driver;
  @BeforeSuite
  public void beforeSuite() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\driver\\New folder\\New folder\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.manage().window().maximize();
    }

  
  @Test
  public void veryfylogin() 
  {
	  
	  driver.get("http://demo.guru99.com/test/newtours/login.php");
	  loginpage logp=new loginpage(driver);
	  logp.typelogin();
	  logp.loginbutton();
	 
	  
  }
  }

  

