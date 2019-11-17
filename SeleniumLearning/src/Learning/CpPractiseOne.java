package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CpPractiseOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.imdb.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar-query\"]")).sendKeys("Bride Wars");
		driver.findElement(By.xpath("//*[@id=\"navbar-query\"]")).sendKeys(Keys.RETURN); //To perform Enter operation
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/table/tbody/tr[1]/td[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/time")).getText();
		String time = driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/time")).getText();
		String genor1 = driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/a[1]")).getText();
		String genor2 = driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/a[2]")).getText();
		String reviewername = driver.findElement(By.xpath("//*[@id=\"titleUserReviewsTeaser\"]/div/span[1]/div[1]/a[1]/span")).getText();
		
		System.out.println(time);
		System.out.println(genor1);
		System.out.println(genor2);
		System.out.println(reviewername);
		driver.close();
	}

}
