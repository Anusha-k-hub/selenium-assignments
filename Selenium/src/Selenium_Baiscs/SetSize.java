package Selenium_Baiscs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SetSize {
	static WebDriver driver;
	String url="http://zlti.com";
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	@Test
	public void setSize() throws Exception {
		Dimension dimension=new Dimension(500,794);
		driver.manage().window().setSize(dimension);
		Thread.sleep(6000);
	}
}
