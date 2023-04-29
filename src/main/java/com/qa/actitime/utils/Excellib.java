package com.qa.actitime.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excellib {

	XSSFWorkbook sheet;

	public Excellib(String excelpath){
		
	File src =new  File(excelpath);
	FileInputStream xlsx;
	try {
		xlsx = new FileInputStream(src);
		sheet = new XSSFWorkbook(xlsx);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	}
	public int getRowcount(int sheetnum)
	{
		
		int rowcount = sheet.getSheetAt(sheetnum).getLastRowNum()+1;
		return rowcount;
	}
	public String getcellData(int sheetnum,int row,int cell) {
		return sheet.getSheetAt(sheetnum).getRow(row).getCell(cell).toString();
		
	}

}
