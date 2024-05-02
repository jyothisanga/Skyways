package com.vtiger.pomclasses;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutility.BaseClasses;

public class LoginPage extends BaseClasses{
	@FindBy(xpath="//input[@name='user_name']")private WebElement untxt;
	@FindBy(xpath="//input[@name='user_password']")private WebElement pwdtxt;
	@FindBy(xpath="//input[@id='submitButton']")private WebElement logtxt;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	public WebElement getUntxt() {
		return untxt;
	}
	public WebElement getPwdtxt() {
		return pwdtxt;
	}
	public WebElement getLogtxt() {
		return logtxt;
	}
	//Bussiness Library
	public void LoginToApp (String UN,String PWD) {
		untxt.sendKeys(UN);
		pwdtxt.sendKeys(PWD);
		logtxt.click();
		
	}

}


