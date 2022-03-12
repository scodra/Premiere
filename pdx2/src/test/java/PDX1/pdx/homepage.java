package PDX1.pdx;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class homepage extends base{


	@Test
	public void basepagenavigation() throws IOException
	{
		driver=initializeDriver();	
		 String url=prop.getProperty("url");
		 System.out.println(url);
		 
		 driver.get(url);
		 
		 driver.manage().window().maximize();
		 
		 String username=prop.getProperty("username");	
		 String password=prop.getProperty("password");		 

		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

      }
	@Test
	public void createorderpage() throws InterruptedException
	{
	    String provider_name=prop.getProperty("Provider");
	    String platform_name=prop.getProperty("Platform");
	    String Ordernumber=prop.getProperty("Ordernumber");
	    String billingparty=prop.getProperty("Billingparty");
		
	    String titletype=prop.getProperty("Titletype");
	    String title_half=prop.getProperty("Title_half");
//	    String title_full=prop.getProperty("Title_full");








		createorder co = new createorder(driver);
		co.clickcreate().click();
		co.clickcreateorder().click();
		co.provider().click();
		co.providerselect(provider_name);
		co.platform().click();
		co.platformselect(platform_name);
		co.ordernumber(Ordernumber);
		co.billingparty().click();
		co.billingpartyselect(billingparty);
		JavascriptExecutor js = (JavascriptExecutor) driver;

	      WebElement element1 = driver.findElement(By.xpath("//*[@role='combobox']"));
		  js.executeScript("arguments[0].scrollIntoView(true);",element1);
		  Thread.sleep(3000);
		//co.titletype().click();
		Thread.sleep(3000);
		//co.titletypeselect(titletype);
		co.title(title_half);
//		co.titleselect(title_full);
		   WebElement element2 = driver.findElement(By.cssSelector("button.btn.new-order-button-cancel.new-order-btn-add.button-focus"));
			  js.executeScript("arguments[0].scrollIntoView(true);",element2);
			  
		co.clickadd().click();
		
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		co.clickfinish().click();
		 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

		 //WebElement element3 = driver.findElement(By.cssSelector("button.btn.btn-md.btn-default.filter-tab-btn-height"));
		  //js.executeScript("arguments[0].scrollIntoView(true);",element3);
		  
			// driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -document.body.scrollHeight);");

			((JavascriptExecutor)driver).executeScript("window.scrollBy(2000,0)");
			//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
			//WebElement element3 = driver.findElement(By.cssSelector("button.btn.btn-default.btn-md.margin-right-4.ng-star-inserted"));
	       // js.executeScript("arguments[0].scrollIntoView();", element3);
			Thread.sleep(5000);


		  co.clickapprove().click();
		
	}

}
