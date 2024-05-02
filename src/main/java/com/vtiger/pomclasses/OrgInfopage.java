package com.vtiger.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutility.WebDriverUtility;

public class OrgInfopage extends WebDriverUtility {
		@FindBy(xpath="//span[.='[ ACC1 ] magnta software -  Organization Information']")private WebElement orgname;
		public OrgInfopage(WebDriver driver) {
			PageFactory.initElements(driver,this );
		}

		public WebElement getOrgHeaderText() {
			return orgname;
		}
//Business Library
			public String getHeader() {
			return orgname.getText();
			}
			
	
				
			}


