package Selenium_Baiscs;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.zlti.com/");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			String url=ele.getAttribute("href");
			verifyLink(url);
		}
	}
	public static void verifyLink(String link) {
		try {
			URL links=new URL(link);
			HttpURLConnection httpConn=(HttpURLConnection)links.openConnection();
			httpConn.connect();
			if(httpConn.getResponseCode()==200) {
				System.out.println(link+"-"+httpConn.getResponseMessage());
			}
			if(httpConn.getResponseCode()==404) {
				System.out.println(link+"-"+httpConn.getResponseMessage());
			}
		}
		catch(Exception e) {
			
		}
		
	}

}
