package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericutility.BaseClasses;

public class VerifyTitleofHomepage extends BaseClasses{
	@Test
	public void TC() {
		String et="vtiger";
		String ht=driver.getTitle();
		Assert.assertEquals(et,ht,"Both are not matching");
		System.out.println("TC is pass");
		System.out.println("I am from Newzen");
		
	}


}
