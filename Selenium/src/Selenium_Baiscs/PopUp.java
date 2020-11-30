package Selenium_Baiscs;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PopUp {
	static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	@Test
	public void test() {
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]"));
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[2]"));
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]"));
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[4]"));
		Set<String> window=driver.getWindowHandles();
		for(String i:window) {
			driver.switchTo().window(i);
			System.out.println(driver.getTitle());
		}
	}

}
