package com.jdbc.demo;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class dateExplorer {

    // Method to display month and day-of-week details
    public void displayMonth(LocalDate date) 
    {
        System.out.println("Month: " + date.getMonth() + " (" + date.getMonthValue() + ")");
        System.out.println("Day of Week: " + date.getDayOfWeek());
    }

    // Method to display year details and leap year status
    public void displayYear(LocalDate date)
    {
        int year = date.getYear();
        System.out.println("Year: " + year);
        
        if (date.isLeapYear()) 
        {
            System.out.println("Leap Year: Yes");
        }
        else {
            System.out.println("Leap Year: No");
        }
    }

    // Method to calculate and display past date by subtracting user-defined months
    public void lookBackMonths(LocalDate date, int monthsToSubtract) 
    {
        LocalDate pastDate = date.minusMonths(monthsToSubtract);
        System.out.println(monthsToSubtract + " months before " + date + " was: " + pastDate);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        dateExplorer explorer = new dateExplorer();
        LocalDate userDate = null;

        // Input loop to ensure valid date parsing
        while (userDate == null) 
        {
            System.out.print("Enter a date (yyyy-MM-dd): ");
            String inputDate = scanner.nextLine();

            try {
                userDate = LocalDate.parse(inputDate);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format! Please use yyyy-MM-dd (e.g., 2026-10-26).\n");
            }
        }

        int choice = 0;

        // Main menu loop
        while (choice != 4) {
            System.out.println("\n=== DATE EXPLORER MENU ===");
            System.out.println("1. Display Month and Day of Week");
            System.out.println("2. Display Year Details & Leap Year Check");
            System.out.println("3. Look Back by Months");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                System.out.println();

                switch (choice) {
                    case 1:
                        explorer.displayMonth(userDate);
                        break;
                    case 2:
                        explorer.displayYear(userDate);
                        break;
                    case 3:
                        System.out.print("Enter number of months to look back: ");
                        int months = scanner.nextInt();
                        explorer.lookBackMonths(userDate, months);
                        break;
                    case 4:
                        System.out.println("Exiting DateExplorer. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option! Please choose between 1 and 4.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }
}