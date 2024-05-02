package com.vtiger.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
		public String readdatafromExcelFile(String Sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
			FileInputStream fisp=new FileInputStream("");
	return WorkbookFactory.create(fisp).getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		}


}
