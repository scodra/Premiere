package PDX1.pdx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public  WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		 prop = new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\Saiesh Naik\\learn2\\pom.xml\\pdx\\src\\main\\java\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		
		if (browsername.equals("chrome"))
			//System.out.println("Chrome");
		{
			System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
			driver= new ChromeDriver();

		}
		return driver;
	}

}
