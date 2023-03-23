package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser{
	
		
		  //Clicking on Categories links #4
		  
			
			 @Test public void CategoriesTest() throws Exception {
				 CommonFuns cat = new CommonFuns();
			  
			  cat.datePicker( "https://www.orangehrm.com/contact-sales/","" ,"Anguilla"); 
			  Thread.sleep(5000); }
			 
		 
	}
 