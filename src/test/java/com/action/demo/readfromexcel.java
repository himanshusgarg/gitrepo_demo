package com.action.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class readfromexcel {
	
	private static XSSFWorkbook ExcelWbook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFRow Row;
	private static XSSFCell Cell;
	
	 static String dir=System.getProperty("user.dir");
	 static String path= dir+"\\DATA\\get.xlsx";
	
		static Logger log=Logger.getLogger("LoggerLogs");
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
try {
	FileReader fr = new FileReader("C:\\test\\tes1t.txt");
	BufferedReader br = new BufferedReader(fr);
	int i;
	while ((i = br.read()) != -1) {
		System.out.println((char) i);
	}
	br.close();
	fr.close();
} catch (FileNotFoundException e) {
	
	log.debug("Test Manual");
	log.error("error"+e);
	log.warn("warn");
	log.trace("trace");
	
	// TODO: handle exception
}
FileInputStream fr1= new FileInputStream(new File(path));
 ExcelWbook=new XSSFWorkbook(fr1);
 ExcelWSheet=ExcelWbook.getSheet("A");
 ExcelWSheet.getRow(0).getCell(0);
 
 
 // Write
 
 ExcelWSheet.createRow(1);
 Row=ExcelWSheet.getRow(1);
 Cell=Row.createCell(1);
 Cell.setCellValue("Int");
 FileOutputStream fout=new FileOutputStream(new File(path));
 ExcelWbook.write(fout);
 fout.flush();
 
 
 System.out.println( ExcelWSheet.getRow(1).getCell(1));
	}

}
