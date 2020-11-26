package Selenium_Baiscs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	public void xPath() {
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).click();
		if(driver.findElement(By.name("q")).isDisplayed()) {
			System.out.println(driver.findElement(By.name("q")).getText());
		}
	}

}
