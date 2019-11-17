import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main (String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseurl = "http://demo.guru99.com/selenium/upload";
		driver.get(baseurl);
		//WebElement uploadfile = driver.findElement(By.className("upload_txt")).sendKeys("C:\\eject_cd.log");
		
	}
	

}
