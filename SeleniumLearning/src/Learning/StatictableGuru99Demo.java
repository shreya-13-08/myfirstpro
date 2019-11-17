package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatictableGuru99Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		String cellValue2 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[1]/td[2]")).getText();
		String cellvalue3 = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(cellValue2);
		System.out.println(cellvalue3);
		driver.close();
	}

}
