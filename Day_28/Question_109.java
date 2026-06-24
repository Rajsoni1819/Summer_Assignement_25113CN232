// Q109 Write a program to Create Library Management System.
package Day_28;

import java.util.Scanner;

public class Question_109 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Library Management System =====");
        System.out.println("1. Add Book");
        System.out.println("2. View Book");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if(choice == 1) {
            System.out.print("Enter Book Name: ");
            String book = sc.nextLine();

            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();

            System.out.println("\nBook Added Successfully!");
            System.out.println("Book: " + book);
            System.out.println("Author: " + author);
        }
        else if(choice == 2) {
            System.out.println("No Books Available.");
        }
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}