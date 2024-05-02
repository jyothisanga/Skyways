
package com.vtiger.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutility.WebDriverUtility;

public class CreateNewOrganiation extends WebDriverUtility {
		
		//Declaration
			@FindBy(xpath="//input[@name='accountname']")private WebElement orgNameedt;
			@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement saveBtn;
		//Initailization
			public CreateNewOrganiation(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
		//Getters
			public WebElement getOrgNameedt() {
				return orgNameedt;
			}
			public WebElement getSaveBtn() {
				return saveBtn;
			}
			public void Createneworganation(String ORGNAME) {
				orgNameedt.sendKeys(ORGNAME);
				saveBtn.click();
}
			//Business Library
			public void CreateNewOrganiation (String ORGNAME) {
				orgNameedt.sendKeys(ORGNAME);
				saveBtn.click();
			}
			
			
				
				
			}
