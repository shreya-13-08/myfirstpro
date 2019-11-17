import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class iFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");

        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e");
      //  driver.switchTo().frame(0);

        Thread.sleep(2000);
        driver.findElement(By.xpath("html/body/a/img")).click();
       


	}

}
