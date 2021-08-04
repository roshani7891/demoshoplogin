package Demoshop;

import org.testng.annotations.Test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Demologin {
	
	//static Logger log=Logger.getLogger()
  WebDriver driver;
  Properties pro=new Properties();
 
  @BeforeSuite
  public void beforeSuite() throws IOException
  {
	  FileInputStream file=new FileInputStream("C:\\Users\\admin\\workspace\\TestingProjectLog4jGitproty\\demoshoplogin.properties");
      pro.load(file);

	  System.setProperty("webdriver.chrome.driver", "E:\\driver\\New folder\\New folder\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
        }

  
  @Test
  public void demologin() 
  {
	  
	  
	  driver.get(pro.getProperty("url"));
	  driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(pro.getProperty("email"));
      driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(pro.getProperty("password"));
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	  
  }
}
