package com.action.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class readFromProperty {
	
	public static void main(String[] args) throws Exception {
		File f= new File("C:\\Users\\himanshu.salil.garg\\eclipse-workspace\\Selenium3plus\\src\\test\\resources\\test2.properties");
		FileInputStream fileinput=new FileInputStream(f);
		 Properties p = new Properties();
		 
		 p.load(fileinput);
		 
		 
		System.out.println( p.getProperty("url"));
		 Enumeration e= p.keys();
		 
		 while(e.hasMoreElements()) {
			 
			 String key= (String) e.nextElement();
			 String value = p.getProperty(key);
			 System.out.println(key+":"+value);
		 }
		 
		 fileinput.close();
		 
		 FileOutputStream fout=new FileOutputStream(f);
		 p.setProperty("pass", "123");
		 p.store(fout, "commenting");
		 fout.close();
}

}