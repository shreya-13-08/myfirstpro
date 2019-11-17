import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techcanvass.com");
		
		//maximize browser
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.linkText("Self-learning Courses"));
		Thread.sleep(3000);
		actions.moveToElement(element).build().perform();
		WebElement element2 = driver.findElement(By.linkText("Automation Testing "));
		Thread.sleep(3000);
		actions.moveToElement(element2).build().perform();
		

	}

}
