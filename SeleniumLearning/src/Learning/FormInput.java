package Learning;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class FormInput {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		
		//maximize browser
		driver.manage().window().maximize();
		 /*FormPage fp = new FormPage();
		 fp.setName(driver, "Shreya");
		 fp.setEmailId(driver, "abc.gmail.com");
		 fp.setPhone(driver, "9958454777");
		 fp.setMessage(driver, "Hello");*/
		
		FormPage myPage = PageFactory.initElements(driver, FormPage.class);
		myPage.nameElement.sendKeys("Shreya");
		myPage.emailElement.sendKeys("abc.gmail.com");
		myPage.phoneElement.sendKeys("9958454777");
}

}
