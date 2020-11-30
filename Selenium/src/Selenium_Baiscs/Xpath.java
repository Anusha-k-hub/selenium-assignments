package Selenium_Baiscs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Xpath {
	static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	@Test
	public void xPath() throws Exception {
		driver.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(10000);
		//driver.findElements(By.xpath("\\ul"))
	}

}
