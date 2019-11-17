package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class FirstTestNg {
	WebDriver driver;
	@Test
	public void firttestcase() {
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		//SendKey n findelement
		driver.findElement(By.name("txtName")).sendKeys("Shreya");
		driver.findElement(By.name("txtEmail")).sendKeys("abc.gmail.com");
		driver.findElement(By.id("txtContact")).sendKeys("9958454777");
		driver.findElement(By.name("txtMessage")).sendKeys("Hello");
		//driver.findElement(By.id("recaptcha-anchor")).click();
		driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();

	}
	@Test
	public void secondtestcase() {
		Select select = new Select(driver.findElement(By.name("ddlSubject")));
		select.selectByVisibleText("Course Enquiry");
		select.selectByValue("Course Enquiry");
	}
	@Test
	public void thirdtestcase() {
		System.out.println("3");
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
