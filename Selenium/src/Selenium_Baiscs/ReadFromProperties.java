package Selenium_Baiscs;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
	public static void main(String[] args) throws IOException
	{
		
		FileReader reader =new FileReader("configure.properties");
			Properties prop=new Properties();
			
			prop.load(reader);
			String url1=prop.getProperty("url");
			String name1=prop.getProperty("name");
			System.out.println(url1);
			System.out.println(name1);
			
		
    
		
	}

}
