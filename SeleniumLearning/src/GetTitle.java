import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Learning.FormPage;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		
		//maximize browser
		driver.manage().window().maximize();
		 
		/*navigate
		driver.navigate().to("http://techcanvass.com/Contact-Techcanvass.aspx");
		*/
		
		//SendKey n findelement
		driver.findElement(By.name("txtName")).sendKeys("Shreya");
		driver.findElement(By.name("txtEmail")).sendKeys("abc.gmail.com");
		driver.findElement(By.id("txtContact")).sendKeys("9958454777");
		driver.findElement(By.name("txtMessage")).sendKeys("Hello");
		//driver.findElement(By.id("recaptcha-anchor")).click();
		driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
		
		/*DropDown using SELECT class of selenium
		In DropDown selectByIndex is the value of element at actual number in the dropdown*/
		/*Select select = new Select(driver.findElement(By.name("ddlSubject")));
		select.selectByVisibleText("Course Enquiry");
		select.selectByValue("Course Enquiry"); */
		
		driver.findElement(By.linkText("Buy Online")).click();
		/*title
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		*/
		
		
	}

}
