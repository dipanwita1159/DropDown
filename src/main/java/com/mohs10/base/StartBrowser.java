package com.mohs10.base;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;


public class StartBrowser {
	 public static WebDriver driver;
	 //set up report
	 public static ExtentReports extent;
	 public static ExtentTest parentTest;
	 public static ExtentTest childTest;
	 ExtentSparkReporter sparkReporter;
	 
	 @BeforeTest
	 public void generateReport()
	 {
		 sparkReporter = new ExtentSparkReporter("Report/AutomationReport.html");
		 extent = new ExtentReports();
		 extent.attachReporter(sparkReporter);
	 }
	 
	 @BeforeMethod
	 public void methodName(Method method)
	 {
		parentTest = extent.createTest(method.getName()); 
	 }
	  @BeforeClass
	  public void beforeClass() {
		  
		  
		   //WebDriverManager.chromedriver().setup();
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

		  ChromeOptions options = new ChromeOptions();
options.addArguments("binary", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");

WebDriver driver = new ChromeDriver(options);

		  //ChromeOptions options = new ChromeOptions();
   // options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		 // WebDriverManager.firefoxdriver().setup();
		  //WebDriverManager.edgedriver().setup();
		  driver = new ChromeDriver(options);
		// driver= new FirefoxDriver();
		 // driver=new msedgeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
		  extent.flush();
	  }

	}
