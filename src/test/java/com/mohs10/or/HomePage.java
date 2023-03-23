package com.mohs10.or;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	public static By datepick=By.xpath("//select[@id='Form_getForm_Country']");
	public static By Numberofemployee=By.xpath("//select[@id='Form_getForm_NoOfEmployees']");
	public static By book=By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]");
	
	
	
	
	
	 //Categories 
	/*public static By lnkComputer =By.xpath("//li[@class='inactive']//a[normalize-space()='Computers']");
	public static By lnkDigitaldownloads =
	  By.xpath("//li[@class='inactive']//a[normalize-space()='Digital downloads']"
	  ); public static By lnkElectronics =
	  By.xpath("//li[@class='inactive']//a[normalize-space()='Electronics']");*/
		
		  public static By lnkApparelandShoes =
		  By.xpath("//li[@class='inactive']//a[normalize-space()='Apparel & Shoes']");
		  public static By dress=By.
		  xpath("//body/div[@class='master-wrapper-page']/div[@class='master-wrapper-content']/div[@class='master-wrapper-main']/div[@class='center-2']/div[@class='page category-page']/div[@class='page-body']/div[@class='product-grid']/div[1]/div[1]"
		  ); public static By dressclick
		  =By.xpath("//input[@id='add-to-cart-button-5']"); 
		  //public static By
		  //dress=By.xpath("//input[@id='add-to-cart-button-5']"); /// public static By
		 // lnkJewelry =
		  //By.xpath("//li[@class='inactive']//a[normalize-space()='Jewelry']"); public
		  public static By lnkbook
		  =By.xpath("//li[@class='inactive']//a[normalize-space()='Books']"); public
		  static By addtocart=By.xpath(
		  "//body[1]/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]"
			); 
				  //public static By mobile=By.
				 // xpath("//li[@class='inactive']//a[normalize-space()='Apparel & Shoes']");
				  
				  //public static By clickonmobile=By.xpath(
				 // "//body[1]/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]"
				  
				 public static By lnkShoppingCart = By.xpath("//span[normalize-space()='Shopping cart']");
				 
 public static By remove=By.xpath("//input[@name='removefromcart']");
 public static By checkout =By.xpath("//button[@id='checkout']");
 public static By adclick=By.xpath("//input[@id='termsofservice']");
		  
		 
			
			//shopping cart
			public static By shop=By.xpath("//span[normalize-space()='Shopping cart']");
			public static By email= By.id("Email");
			public static By password=By.id("Password");
}
			
			 //public static By lnkGiftCards =By.xpath("//li[@class='inactive']//a[normalize-space()='Gift Cards']");
	 
	//To Register
	/*public static By lnkRegister = By.xpath("//a[@href=\"/register\"]");
	public static By rbGender = By.id("gender-female");
	public static By txtFirstname = By.id("FirstName");
	public static By txtLastname = By.id("LastName");
	public static By txtEmail = By.id("Email");
	public static By txtPassword = By.id("Password");
	public static By txtConfirmpassword = By.id("ConfirmPassword");
	public static By btnRegister = By.id("register-button");
	public static By btnContinue = By.xpath("//input[@value='Continue']");
}

	
/*
 * //to login
 * 
 * public static By lnkLogin = By.xpath("//a[@href=\"/login\"]"); public static
 * By txtemail = By.className("email"); public static By txtpwd =
 * By.className("password"); public static By btnlogin =
 * By.xpath("//input[@value='Log in']"); public static By lnkLogout =
 * By.xpath("//a[@class='ico-logout']");
 * 
 * //Customer Service public static By btnNews =
 * By.xpath("//a[@href=\"/news\"]"); public static By btnBlog =
 * By.xpath("//a[@href=\"/blog\"]"); public static By btnComparelist =
 * By.xpath("//a[@href=\"/compareproducts\"]"); public static By
 * btnRecentlyviewed = By.xpath("//a[@href=\"/recentlyviewedproducts\"]");
 * 
 * //To subscribe public static By lnkYoutube =
 * By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"); public
 * static By btnSubscribe =
 * By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]");
 * 
 * //To goto sitemap public static By lnkSitemap =
 * By.xpath("//a[normalize-space()='Sitemap']"); public static By lnkSearch =
 * By.xpath("//div[@class='entity-body']//a[normalize-space()='Search']");
 * public static By txtSearchKeyword = By.xpath("//input[@id='Q']"); public
 * static By btnsearch = By.xpath("//input[@class='button-1 search-button']");
 * 
 * //to goto shipping&returns public static By lnkShippingandReturns =
 * By.xpath("//a[normalize-space()='Shipping & Returns']"); public static By
 * lnkShpng = By.xpath("//h1[normalize-space()='Shipping & Returns']");
 * 
 * //Goto Contactus public static By lnkContactUs =
 * By.xpath("//a[normalize-space()='Contact us']"); public static By txtName =
 * By.xpath("//input[@id='FullName']"); public static By txtEmaill =
 * By.xpath("//input[@id='Email']"); public static By txtEnquiry =
 * By.xpath("//textarea[@id='Enquiry']"); public static By btnSubmit =
 * By.xpath("//input[@name='send-email']"); public static By txtcontactus =
 * By.xpath("//div[@class='result']");
 * 
 * //goto new products public static By lnkNewProducts =
 * By.xpath("//a[normalize-space()='New products']"); public static By txtphCvr
 * = By.xpath("//h1[@itemprop='name']");
 */
	
	//go to shpng cart

	//public static By txtemptyshpngcart = By.xpath("//div[@class='order-summary-content']");
	
	/*
	 * //-------login and order-------- public static By lnkApparelAndShoes =
	 * By.xpath("//a[@href=\"/apparel-shoes\"]"); public static By imgBelt =
	 * By.xpath(
	 * "//img[@src=\"http://demowebshop.tricentis.com/content/images/thumbs/0000217_casual-golf-belt_125.jpeg\"]"
	 * ); public static By btnAddtoCart =
	 * By.xpath("//input[@id='add-to-cart-button-40']"); public static By chkAgree =
	 * By.xpath("//input[@id='termsofservice']"); public static By btnCheckout =
	 * By.xpath("//button[@id='checkout']"); public static By btnCntnue =
	 * By.xpath("//input[@onclick='Billing.save()']"); public static By
	 * btnBillingContinue = By.xpath("//input[@onclick='Billing.save()']"); public
	 * static By btnShippingContinue =
	 * By.xpath("//input[@onclick='Shipping.save()']"); public static By
	 * btnShpngMthdContinue =
	 * By.xpath("//input[@class='button-1 shipping-method-next-step-button']");
	 * public static By btnPaymentMthdContinue =
	 * By.xpath("//input[@class='button-1 payment-method-next-step-button']");
	 * public static By btnPaymentInfoContinue =
	 * By.xpath("//input[@class='button-1 payment-info-next-step-button']"); public
	 * static By btnConfirm = By.xpath("//input[@value='Confirm']");
	 * 
	 * //public static By lnkOrderDetails =
	 * By.xpath("//a[normalize-space()='Click here for order details.']"); public
	 * static By classOrderconfrmtn = By.
	 * xpath("//strong[normalize-space()='Your order has been successfully processed!']"
	 * );*/
	

	//Login In OrangeHrm//
	/*  public static By loginemail=By.xpath("//input[@placeholder='Username']");
	  public static By loginpwd=By.xpath("//input[@placeholder='Password']");
	  public static By clickLoginButton=By.xpath("//button[normalize-space()='Login']");
	  //Admin//
	  public static By adminbuttonClick=By.xpath("//li[1]//a[1]//span[1]");
	  public static By ckeckbox=By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-paper-container']/div[@class='orangehrm-container']/div[@role='table']/div[1]/div[1]/div[1]/div[1]");
	  public static By deletbutton= By.xpath("//div[45]//div[1]//div[6]//div[1]//button[1]//i[1]");
	  public static By userRole=By.xpath("//div[4]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//i[1]");
	  public static By deletrole=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]/i[1]");
	public static By popup=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]/i[1]");
}*/
	 