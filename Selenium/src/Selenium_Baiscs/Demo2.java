package Selenium_Baiscs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo2 {
	static WebDriver driver;
    String url="https://jqueryui.com/droppable/";
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
	@Test
	public void test() throws Exception {
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	Actions action=new Actions(driver);
	Thread.sleep(2000);
	action.dragAndDrop(drag, drop).perform();
	Thread.sleep(2000);
	}

	


	
}
