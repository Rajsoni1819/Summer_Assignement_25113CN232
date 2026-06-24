// Q111 Write a program to Create Ticket Booking System.
package Day_28;

import java.util.Scanner;

public class Question_111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Ticket Booking System =====");
        System.out.println("1. Book Ticket");
        System.out.println("2. Cancel Ticket");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.print("Enter Number of Tickets: ");
            int tickets = sc.nextInt();

            int fare = tickets * 250;

            System.out.println("Booking Successful!");
            System.out.println("Total Fare: ₹" + fare);
        }
        else if(choice == 2) {
            System.out.println("Ticket Cancelled Successfully!");
        }
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}