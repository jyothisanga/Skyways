package com.vtiger.genericutility;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.pomclasses.LoginPage;

public class BaseClasses {
	public PropertyFileUtility pu=new PropertyFileUtility();
		public ExcelUtility eu=new ExcelUtility();
		public JavaUtility ju=new  JavaUtility();
		public WebDriverUtility wu = new WebDriverUtility();
		public WebDriver driver=null;//for runtime polymorphism
		
		
		@BeforeSuite
		public void bsconfig() {
			System.out.println("====DB CONNECTION=====");
		}
		@AfterSuite
		public void  asconfig() {
			System.out.println("====DB DISCONNECTION==== ");
		}
		@BeforeClass
		public void bcconfig() throws Throwable {
			String BROWSER = pu.readDataFromPropertyfile("browser");
			String URL = pu.readDataFromPropertyfile("url");
			if(BROWSER.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
				System.out.println("Edge driver is Launched");
			}
			else if(BROWSER.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
				System.out.println("chrome driver is Launched");
			}
			else 
			{
				System.out.println("Invalid browser name");
			}
			driver.get(URL);
			wu.getScreenshot(driver,"LoginPge");
			wu.maximizeBrowserwindow(driver);
			wu.waitforpageload(driver);
		}
		@AfterClass
		public void terDown() {
			driver.quit();
		}
		@BeforeMethod
		public void bmconfig() throws Throwable {
			String UN = pu.readDataFromPropertyfile("un");
			String PWD = pu.readDataFromPropertyfile("pwd");
			
		LoginPage lp=new LoginPage(driver);
		lp.LoginToApp(UN, PWD);
		wu.getScreenshot(driver,"HomePage");

		}

		@AfterMethod
		public void amconfig() {
			System.out.println("Logout from app");
	
		
	    }

}

	

	




	

	
	
