package com.vtiger.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	public String readDataFromPropertyfile(String key) throws IOException {
		FileInputStream fisp=new FileInputStream("");
		Properties p=new Properties();
		p.load(fisp);
		return p.getProperty(key);
	}


}
