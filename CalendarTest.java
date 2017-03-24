package com.janghoon.test;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        String[] days ={"SUNDAY","MONDAY", "TUESDAY", "WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        int mon = Integer.parseInt(month);
        int date = Integer.parseInt(day);
        int yr = Integer.parseInt(year);
        
        
        Calendar cal = Calendar.getInstance();
        
        cal.set(Calendar.YEAR, yr);
        cal.set(Calendar.MONTH, mon - 1);
        cal.set(Calendar.DAY_OF_MONTH, date);
 
        int d = cal.get(Calendar.DAY_OF_WEEK)-1;
        String dy= days[d];
        
        System.out.println(dy);
        
        in.close();

	}

}
