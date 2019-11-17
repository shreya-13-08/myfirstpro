package Learning;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		List row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("No of cols is: " +col.size());
		System.out.println("No of rows is: " +row.size());
	for (Iterator iterator = row.iterator(); iterator.hasNext();) 
	{
		Object rowvalue = (Object) iterator.next();
		System.out.println(rowvalue.toString());
		
	}
	
	for (Iterator iterator = col.iterator(); iterator.hasNext();) {
		Object colvalue = (Object) iterator.next();
		System.out.println(colvalue.toString());
		
	}
			
			
		
		driver.close();
		

	}

}
