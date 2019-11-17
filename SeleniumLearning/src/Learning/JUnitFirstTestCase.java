package Learning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JUnitFirstTestCase {

	public class JunitFirstTestCase {

			@Test
			public void testSetEmailId() {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://techcanvass.com");
				
				driver.manage().window().maximize();
				
				//page navigation
				driver.navigate().to("https://techcanvass.com/Contact-Techcanvass.aspx");
				
				//Get page title
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				assertEquals("Contact Us - TechCanvass", driver.getTitle());
			}

			

		}
	
	public void test() {
		fail("Not yet implemented");
	}

}
