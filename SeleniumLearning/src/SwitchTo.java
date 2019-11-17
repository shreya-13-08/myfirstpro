import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://techedgeplus.com/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"txtLoginid\"]")).sendKeys("test1");
        driver.findElement(By.xpath("//*[@id=\"txtpassword\"]")).sendKeys("test1");

        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
       // driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
		driver.close();


	}

}
