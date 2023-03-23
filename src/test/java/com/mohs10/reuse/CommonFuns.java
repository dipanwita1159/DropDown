package com.mohs10.reuse;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

	public class CommonFuns extends Action {
		
		public Action aDriver;
		public WebDriver driver;
		
		public CommonFuns()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
			  
				
              
			 
		public void datePicker(String url,String value1,String value2) throws Exception {
			StartBrowser.childTest=StartBrowser.parentTest.createNode("login");
			aDriver.navigateToApplication(url);
			
			/*
			 * long timeoutInSeconds = 0; WebDriver webDriver = null; WebDriverWait wait =
			 * new WebDriverWait(webDriver, timeoutInSeconds);
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker"))
			 * ); aDriver.click(HomePage.datepick, "date pickers");
			 */
			//aDriver.datepicker(HomePage.datepick, "url");
			//aDriver.click(HomePage.book, "value2");
			Thread.sleep(2000);
			JavascriptExecutor je=(JavascriptExecutor)driver;//Instance of js executor
			je.executeScript("window.scroll(0,500)\r\n");
			 aDriver.selectDropDown(HomePage.datepick,"value", value2);
			 
				//je.executeScript("window.scroll(0,5000)\r\n");
			// aDriver.selectDropDown(HomePage.Numberofemployee, "index", value2);
			 
			/*
			 * Actions a1=new Actions(driver); a1.sendKeys(Keys.PAGE_UP).perform();
			 * a1.sendKeys(Keys.ENTER).perform();
			 */
			
			
		}
	
	
	
	}
			  
			  
			  
	
	
			  
			  
			  
			  
			  
			 