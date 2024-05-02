package com.vtiger.pomclasses;


	import org.apache.xmlbeans.impl.xb.xsdschema.Public;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Orgapage {
		@FindBy(xpath ="(//a[.='Organizations'])[1]")private WebElement orgmod;
		@FindBy(xpath="(//img[@title='Create Organization...']")private WebElement demod;
		@FindBy(xpath="(//input[@name='accountname']")private WebElement orgnm ;
		@FindBy(xpath="((//input[@accesskey='S'])[1]")private WebElement savdm;
		
		//create constructor
		public Orgapage(WebDriver driver) {
			PageFactory.initElements(driver ,this);
			
		}

		public WebElement getOrgmod() {
			return orgmod;
		}

		public WebElement getDemod() {
			return demod;
		}

		public WebElement getOrgnm() {
			return orgnm;
		}

		public WebElement getSavdm() {
			return savdm;
		}
		//bussiness library
		public void orgmod () {
			orgmod.click();
		}
		public void demod() {
			demod.click();
		}
		public void orgnm() {
			orgnm.sendKeys("demo");
		}
		public void savdm() {
			savdm.click();
		}
			
			
		
			
		
			
		
	}

	

