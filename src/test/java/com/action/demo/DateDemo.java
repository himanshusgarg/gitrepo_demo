package com.action.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.xalan.xsltc.compiler.sym;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        Date date=new Date();

		System.out.println(date.toString());
		SimpleDateFormat ft= new SimpleDateFormat("E dd MMMMMMMM yyyy 'at' hh:mm:ss a zzz");
	    System.out.println(	ft.format(date));
	    System.out.println(date);
	    
	    // Didderence of time
	    
	    String time1="16:00:00";
	    String time2="18:00:00";
	    
	    SimpleDateFormat format= new SimpleDateFormat("HH:mm:ss");
	    Date date1= format.parse(time1);
	    Date date2=format.parse(time2);
	    long dif=date2.getTime()-date1.getTime();
	    System.out.println("date1 "+date1);
	    System.out.println("difference is "+dif/3600);
	    int com=date1.compareTo(date2);
	    System.out.println(com);
	    int com2=date2.compareTo(date1);
	    System.out.println(com2);
	}

}
