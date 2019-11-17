package Learning;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ArchitectureRun {
	WebDriver driver;
  @Test
  public void CheckTitle () 
  {
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, "Contact Us - TechCanvass");
  }
  @Test
  public void CheckUrl()
  {
	  String actualurl = driver.getCurrentUrl();
	  Assert.assertEquals(actualurl, "http://techcanvass.com/Contact-Techcanvass.aspx");
  }
  @Test
  public void FormFilling()
  {
	  FormPage myPage = PageFactory.initElements(driver, FormPage.class);
		myPage.nameElement.sendKeys("Shreya");
		myPage.emailElement.sendKeys("abc.gmail.com");
		myPage.phoneElement.sendKeys("9958454777");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}
