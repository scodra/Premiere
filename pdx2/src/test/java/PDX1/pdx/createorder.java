package PDX1.pdx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createorder {
	
	public WebDriver driver;
	
          
          public createorder(WebDriver driver) {
        	  this.driver=driver;
		}

          By create=	By.linkText("Create");

		public WebElement clickcreate()
          {
        	  return driver.findElement(create);
          }

        By createorder=	By.linkText("Create Order");
        
		public WebElement clickcreateorder()
        {
      	  return driver.findElement(createorder);
        }
// Provider
	    By provider=	By.xpath("//input[@placeholder='Select Provider']");
        

	      public WebElement provider()
	        {
	      	  return driver.findElement(provider);
	        }
			int a=0;
		 By providerselect=	By.xpath("//*[@role='button']");
	        
				public void providerselect(String provider_name)
		        {
		      	   a=driver.findElements(providerselect).size();
		      	   //System.out.println(a);
		      	   //System.out.println(provider_name);

		      	   
		      	   for (int b=1;b<a;b++)
		      	   {
		      		   String providername=driver.findElements(providerselect).get(b).getText();
                       		if (providername.equals(provider_name))      
                       		{
         		      		  driver.findElements(providerselect).get(b).click();
                       			System.out.println(providername);
break;
                       		}
		      	   }
		        }	

// Platform

			    By platform=	By.xpath("//input[@placeholder='Select Platform']");
			      public WebElement platform()
			        {
			      	  return driver.findElement(platform);
			        }
					int c=0;
				 By platformselect=	By.xpath("//*[@role='button']");
			        
						public void platformselect(String platform_name)
				        {
				      	   c=driver.findElements(platformselect).size();
				      	   //System.out.println(c);
				      	   //System.out.println(platform_name);

				      	   
				      	   for (int b=1;b<c;b++)
				      	   {
				      		   String platformname=driver.findElements(platformselect).get(b).getText();
		                       		if (platformname.equals(platform_name))      
		                       		{
		         		      		  driver.findElements(providerselect).get(b).click();
		                       			break;

		                       		}
				      	   }
				        }
						
// Order Number
					    By ordernumber=	By.xpath("//input[@placeholder='Order Number']");
					    
					    public void ordernumber(String Ordernumber)
				        {
				      	  driver.findElement(ordernumber).click();
				      	driver.findElement(ordernumber).sendKeys(Ordernumber);
				        }
// Billing Party
					    By billingparty=	By.xpath("//input[@placeholder='Select Billing Party']");
					      public WebElement billingparty()
					        {
					      	  return driver.findElement(billingparty);
					        }
							int d=0;
						 By billingpartyselect=	By.xpath("//*[@role='button']");
					        
								public void billingpartyselect(String billingparty_name)
						        {
						      	   c=driver.findElements(billingpartyselect).size();
						      	  // System.out.println(c);
						      	  // System.out.println(billingparty_name);

						      	   
						      	   for (int b=1;b<c;b++)
						      	   {
						      		   String platformname=driver.findElements(billingpartyselect).get(b).getText();
				                       		if (platformname.equals(billingparty_name))      
				                       		{
				         		      		  driver.findElements(billingpartyselect).get(b).click();
				                       			break;

				                       		}
						      	   }
						        }
//Title Type
							
							


								By titletype=	By.xpath("//input[@placeholder='Select Type']");
							      public WebElement titletype()
							        {
							      	  return driver.findElement(titletype);
							        }
							     
									//int e=0;
								 By titletypeselect=	By.xpath("//ul[@class='dropdown-menu show']");
							        
										public void titletypeselect(String titletype_name)
								        {
								      	   int e=driver.findElements(titletypeselect).size();
								      	   System.out.println("size"+e);
								      	  // System.out.println(titletype_name);

								      	   
								      	   for (int b=1;b<e;b++)
								      	   {
								      		   String titletypename=driver.findElements(titletypeselect).get(b).getText();  /*.get(b).getText();*/
								      		 System.out.println(titletypename);
						                       		/*if (titletypename.equals(titletype_name))      
						                       		{
						         		      		//  driver.findElements(titletypeselect).get(b).click();
						                       			break;

						                       		} */
								      	   }
								        }
		
// Select a title
										
								By title=	By.xpath("//*[@role='combobox']");
									      public void title(String title_half)
									        {
									      	  driver.findElement(title).sendKeys(title_half);;
									        }
			

											int f=0;
										 By titleselect=	By.xpath("//*[@role='option']");
									        
												public void titleselect(String title_full)
										        {
										      	   f=driver.findElements(titleselect).size();
										      	   //System.out.println(f);
										      	   //System.out.println(title_name);

										      	   
										      	   for (int b=1;b<f;b++)
										      	   {
										      		   String titlename=driver.findElements(titleselect).get(b).getText();
							         		      		//  System.out.println(titlename);

								                       		if (titlename.equals(title_full))      
								                       		{
								         		      		  driver.findElements(titleselect).get(b).click();
								                       			break;

								                       		}
										      	   }

										       }	
// Click on Add
												// By add=	By.linkText("Add");
                                                   By add=  By.cssSelector("button.btn.new-order-button-cancel.new-order-btn-add.button-focus");
													public WebElement clickadd()
											          {
											        	  return driver.findElement(add);
											          }
	//Click on Finish
													By finish=  By.cssSelector("button.btn.btn-primary.button-focus.margin-left-10");
													public WebElement clickfinish()
											          {
											        	  return driver.findElement(finish);
											          }
// Click on Approve
													By approve=  By.xpath("//span[contains(text(),'Approve')]");
													public WebElement clickapprove()
											          {
											        	  return driver.findElement(approve);
											          }
													
}
