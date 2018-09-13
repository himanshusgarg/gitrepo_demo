package com.action.demo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c=new GregorianCalendar();
		
		int year=c.get(Calendar.YEAR);
		int month= c.get(Calendar.MONTH);
		
		c.add(Calendar.DAY_OF_MONTH,1);
		int d= c.get(Calendar.DAY_OF_MONTH);
         System.out.println(d);
	}

}
