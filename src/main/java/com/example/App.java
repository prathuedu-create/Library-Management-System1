package com.example;
import java.util.Scanner;

public class App {
    public static int calculateFine(int days) {
        int allowedDays = 7;
        int finePerDay = 5;

        if (days > allowedDays) {
            return (days - allowedDays) * finePerDay;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Name:");
        String name = sc.nextLine();

        System.out.println("Enter User ID:");
        String id = sc.nextLine();

        System.out.println("Enter Number of Books Issued:");
        int books = sc.nextInt();

        String[] bookNames = new String[books];
        sc.nextLine(); // consume newline

        for (int i = 0; i < books; i++) {
            System.out.println("Enter Book " + (i + 1) + " Name:");
            bookNames[i] = sc.nextLine();
        }

        System.out.println("Enter Number of Days Borrowed:");
        int days = sc.nextInt();

        int fine = calculateFine(days);

      
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);

        System.out.println("\nBooks Issued:");
        for (int i = 0; i < books; i++) {
            System.out.println("- " + bookNames[i]);
        }

        System.out.println("\nDays Borrowed: " + days);
        System.out.println("Total Fine: ₹" + fine);

        sc.close();
    }
}
