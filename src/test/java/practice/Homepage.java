package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath = "//div[@class='inventory_item_name ']")private WebElement backpacktxt;
	@FindBy(xpath = "//div[@class='inventory_item_name ']")private WebElement bikelighttxt;
	@FindBy(xpath = "//div[@class='inventory_item_name ']")private WebElement shirttxt;
	@FindBy(xpath = "//div[@class='inventory_item_name '] ")private WebElement jockettxt;
	@FindBy(xpath = "//div[@class='inventory_item_name ']")private WebElement onesidetxt;
	@FindBy(xpath = "//div[@class='inventory_item_name ']")private WebElement redsirttxt;
	public Homepage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
		
    
		
	}
	public WebElement getBackpacktxt() {
		return backpacktxt;
	}
	public WebElement getBikelighttxt() {
		return bikelighttxt;
	}
	public WebElement getShirttxt() {
		return shirttxt;
	}
	public WebElement getJockettxt() {
		return jockettxt;
	}
	public WebElement getOnesidetxt() {
		return onesidetxt;
	}
	public WebElement getRedsirttxt() {
		return redsirttxt;
	}
		
	}
	


