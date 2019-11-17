package Learning;
 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicictWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		driver.manage().window().maximize();
		
		
		//ImplicitWait
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 4);
		
		//locators
		driver.findElement(By.name("txtName")).sendKeys("Shreya");
		driver.findElement(By.id("txtEmail")).sendKeys("abc.gmail.com");
		driver.findElement(By.id("txtContact")).sendKeys("9958454777");
		driver.findElement(By.name("txtMessage")).sendKeys("Hello");
		
		//ExplicitWait
		//WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"btnSubmit\"]")));
		WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ndshdhb")));
		submitButton.click();
		driver.close();
	}

}
