package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage {
		
	//Page Factory Model
	@FindBy (name= "txtName")
	WebElement nameElement;	
	@FindBy (id = "txtEmail")
	WebElement emailElement;
	@FindBy (id = "txtContact")
	WebElement phoneElement;
	
	public void setName(String name)
	{
		nameElement.sendKeys(name);
	}
	public void setEmail(String email)
	{
		emailElement.sendKeys(email);
	}
	public void setContact(String phone)
	{
		phoneElement.sendKeys(phone);
	}
	
	
	/*Page Object Model
	By namePara = By.name("txtName");
	By emailPara = By.id("txtEmail");
	By contactPara = By.id("txtContact");*/
	/*public void setName(WebDriver driver, String name)
	{
		//driver.findElement(By.name("txtName")).sendKeys(name);
		//driver.findElement(namePara).sendKeys(name);
	
	
	public void setEmailId (WebDriver driver, String email)
	{
		//driver.findElement(By.id("txtEmail")).sendKeys(email);
		driver.findElement(emailPara).sendKeys(email);
		}
	
	public void setPhone(WebDriver driver, String phone)
	{
		//driver.findElement(By.id("txtContact")).sendKeys(phone);
		driver.findElement(contactPara).sendKeys(phone);
	}	
	
	public void setMessage(WebDriver driver, String msg)
	{
		driver.findElement(By.name("txtMessage")).sendKeys(msg);
	}*/
	
	public void clickSubmit(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
	}
}
