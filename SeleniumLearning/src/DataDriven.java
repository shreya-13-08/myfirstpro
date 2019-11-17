import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://techedgeplus.com/");
		driver.manage().window().maximize();
		FileInputStream fs = new FileInputStream("C:\\DataDrivenTesting\\TestData.xlsx");
		//xss used cz excel sheet extension is xlsx
		XSSFWorkbook xw = new XSSFWorkbook(fs);
		XSSFSheet xs = xw.getSheetAt(0);

		//HSSFSheet   --- when xls extension

		for (int row= 1; row <= xs.getLastRowNum(); row++) {
			int col =1;
			XSSFCell   user, pass;
			user = xs.getRow(row).getCell(col);
			pass = xs.getRow(row).getCell(col+1);
			System.out.println(user.toString());
			System.out.println(pass.toString());
			driver.findElement(By.xpath("//*[@id=\"txtLoginid\"]")).sendKeys(user.toString());
			driver.findElement(By.xpath("//*[@id=\"txtpassword\"]")).sendKeys(pass.toString());
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			driver.findElement(By.xpath("//*[@id=\"txtLoginid\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"txtpassword\"]")).clear();





		}

	}
}