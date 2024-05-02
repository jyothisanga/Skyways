package com.vtiger.pomclasses;


	import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HomePage   {
		@FindBy(xpath ="(//a[.='Organizations'])[1]")private WebElement orgmod;
		@FindBy(xpath ="(//a[.='Contacts'])[1]")private WebElement conmod;
		@FindBy(xpath ="((//a[.='Opportunities'])[1]")private WebElement oprmod;
		@FindBy(xpath ="((//td[@valign='bottom'])[2]")private WebElement admod;
		@FindBy(xpath ="(//a[.='Sign Out']")private WebElement signmod;
		//create the constructor
		public HomePage(WebDriver driver) {
			PageFactory.initElements( driver,this);
			
			
			
		}
		public WebElement getOrgmod() {
			return orgmod;
		}
		public WebElement getConmod() {
			return conmod;
		}
		public WebElement getOprmod() {
			return oprmod;
		}
		public WebElement getAdmod() {
			return admod;
		}
		public WebElement getSignmod() {
			return signmod;
		}
		//Business Library
		public void clickOnOrgLink() {
			orgmod.click();
		}
			public void clickOnContactsLink() {
				
				conmod.click();
			}
			public void logoutfromApp(WebDriver driver) {
				signmod.click();
				
				
			}
				
				
			
			
			
			
		}
		
			
		
			
		
	   


	






