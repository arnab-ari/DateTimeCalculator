package com.sapient.datetime;

import java.util.Scanner;

public class DateCalculatorRunner {
	public static void main(String[] args) {		
		DateCalculator dc = new DateCalculator();	
		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate(31,12,2020);
		MyDate d3 = new MyDate("01/01/2021");
		//dc.subtractDate(d1, d2);
		System.out.println("126 days from now:");
		System.out.println(dc.addDaysTo(d1, 126));
		System.out.println("128 days before 01/01/2021: ");
		System.out.println(dc.subtractDaysFrom(d3, 127));
		
		DateCalculatorMenu menu = new DateCalculatorMenu();
		menu.getOptions();
		int option;
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		dc.performOperation(option);
		sc.close();
	}
	
	
}


////LocalDate d = LocalDate.now();
//LocalDate d1 = LocalDate.of(2020, 12, 10);
//LocalDate d2 = LocalDate.of(2020, 12, 15);
//
//long ms = (d2.toEpochSecond(LocalTime.MIDNIGHT,ZoneOffset.of("Z")) - d1.toEpochSecond(LocalTime.MIDNIGHT,ZoneOffset.of("Z")))/86400;
//System.out.println(ms);


//Calendar rn = Calendar.getInstance();
//System.out.println(rn);
//System.out.println(d);
////System.out.println(d1);
//MyDate d1 = new MyDate();
//MyDate d2 = new MyDate(12,3,1999);
//d2.print();
//MyDate d3 = new MyDate("05/01/2010");
//MyDate d4 = new MyDate("01-02-2015");
//System.out.println(d1);
//System.out.println(d2);
//System.out.println(d3);
//System.out.println(d4);
////System.out.println(d5);

//Calendar rightNow = Calendar.getInstance();
//System.out.println(rightNow.toString());
//String myString = DateFormat.getDateInstance(DateFormat.MEDIUM).format(rightNow);
//System.out.println(myString);
////System.out.println(rightNow.get(Calendar.YEAR));
////System.out.println(rightNow.get(Calendar.MONTH));
////System.out.println(rightNow.get(Calendar.DAY_OF_MONTH));
//rightNow.set(120, 10, 10);
//Date dt = rightNow.getTime();
//System.out.println(dt);
//System.out.println(rightNow.toString());
//rightNow.setTime(new Date());
//System.out.println(rightNow);