package com.jdbc.demo;

import java.time.LocalDate;
import java.time.Month;

//public class dateTime {
//	public static void main(String[] args) {
//		 
//		LocalDate now= LocalDate.now();
//		
//		System.out.println("Today's date is : "+ now);
//		
//		int dayOfMonth = now.getDayOfMonth();
//		Month month= now.getMonth();
//		int year= now.getYear();
//		
//		System.out.println("Day : "+ dayOfMonth);
//		System.out.println("Month: "+month);
//		System.out.println("Year : "+year);
//		
//		
//		LocalDate customeDate = LocalDate.of(2026, 12, 31);
//		System.out.println(customeDate);
//		
//		System.out.println(now);
//        LocalDate yesterday = now.minusDays(1);
//        System.out.println("\nYesterday was: " + yesterday);
//
//        LocalDate pastDate = now.minusMonths(100);
//
//        System.out.println("100 months before was: " + pastDate);
//	}
//	
//	
//
//}



import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;
import java.util.Set;

class dataTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a time zone (eg. Asia/Tokyo): ");
        String zoneInput = scanner.nextLine();

        try {
            ZoneId zone = ZoneId.of(zoneInput);
            ZonedDateTime currentTime = ZonedDateTime.now(zone);
            System.out.println("Time zone: " + zone);
            System.out.println("Current date and time: " + currentTime);

        } catch(java.time.DateTimeException e) {
            System.out.println("Invalid time zone! Please enter a valid zone.");
        }
        scanner.close();
    }
}