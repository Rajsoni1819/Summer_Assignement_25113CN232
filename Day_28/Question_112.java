// Q112 Write a program to Create Contact Management System.
package Day_28;

import java.util.Scanner;

public class Question_112 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Contact Management System =====");
        System.out.println("1. Add Contact");
        System.out.println("2. View Contact");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if(choice == 1) {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();

            System.out.println("Contact Saved Successfully!");
            System.out.println("Name: " + name);
            System.out.println("Mobile: " + mobile);
        }
        else if(choice == 2) {
            System.out.println("No Contact Found.");
        }
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}