package Demo99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage{
   WebDriver driver;
public  loginpage (WebDriver driver) 
{
  this.driver=driver;
}
By username=By.name("userName");
By Password=By.name("password");
By signin=By.name("submit");

public void typelogin()
{
    driver.findElement(username).sendKeys("RRRRR");
    driver.findElement(Password).sendKeys("ppppp");

}
public void loginbutton()
{
driver.findElement(signin)	.click();
}
}