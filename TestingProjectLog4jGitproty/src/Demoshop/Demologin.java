package Demoshop;

import org.testng.annotations.Test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Demologin {
	
	static Logger log=Logger.getLogger(Demologin.class.getName());
  WebDriver driver;
  Properties pro=new Properties();
 
  @BeforeSuite
  public void beforeSuite() throws IOException
  {
	  FileInputStream file=new FileInputStream("C:\\Users\\admin\\workspace\\TestingProjectLog4jGitproty\\demoshoplogin.properties");
      pro.load(file);

	  System.setProperty("webdriver.chrome.driver", "E:\\driver\\New folder\\New folder\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
      
	  log.debug("open browser");

        }

  
  @Test
  public void demologin() throws IOException 
  {
  
	  log.info("open url");

	  driver.get(pro.getProperty("url"));
	  driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(pro.getProperty("email"));
          driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(pro.getProperty("password"));
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	  System.out.println("pull project");
	  
	  Layout l=new PatternLayout();
	  
	//  Appender ap=new ConsoleAppender(l);
	 // log.addAppender(ap);

	  
	  
	  Appender ap1=new FileAppender(l,"lolo.txt");
	  log.addAppender(ap1);
	  log.debug("Debug");
	  log.info("info");
	  log.warn("warn");
	  log.error("error");
	  log.fatal("fatal");
	   System.out.println("login succefully");
	  
  }

}

