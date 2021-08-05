package Demoshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

public class registerdemo
{
WebDriver driver;
	
    public registerdemo(WebDriver driver)
    {
	this.driver=driver;
    }
       By gender=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/label");
       By firstname=By.name("FirstName");
       By lastname=By.name("LastName");
       By email=By.name("Email");
       By password =By.name("Password");
       By confmpw=By.name("ConfirmPassword");
       By register=By.xpath("//*[@id='register-button']");
    

public void setgender()
{
    driver.findElement(gender).click();
}

public void setfirstname()
 {
	driver.findElement(firstname).sendKeys("roshani");
 }
public void setlastname()
{
	driver.findElement(lastname).sendKeys("bhoyar");
}

public void setemail()
{
	driver.findElement(email).sendKeys("roshani789117@gmail.com");
}
public void setpassword()
{
	driver.findElement(password).sendKeys("roshani781991");
}

public void setcmfmpassword()
{
	driver.findElement(confmpw).sendKeys("roshani781991");
}
public void register()
{
	driver.findElement(register).click();
}




}


