package Selenium_Baiscs;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollWebPage {
	static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
		
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	@Test
	public void scrollWebPage() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
}
