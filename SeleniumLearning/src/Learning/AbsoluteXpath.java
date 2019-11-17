package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Contact-Techcanvass.aspx");
		driver.manage().window().maximize();
		
		String phoneNumber = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div/ul/li[3]")).getText();
		System.out.println(phoneNumber);
		driver.close();
	}

}
