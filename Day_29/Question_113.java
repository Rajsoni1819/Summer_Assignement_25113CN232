// Q113 Write a program to Create Menu Driven Calculator.
package Day_29;

import java.util.Scanner;

public class Question_113 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENU DRIVEN CALCULATOR =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter First Number: ");
        double a = sc.nextDouble();

        System.out.print("Enter Second Number: ");
        double b = sc.nextDouble();

        if(choice == 1)
            System.out.println("Result = " + (a + b));
        else if(choice == 2)
            System.out.println("Result = " + (a - b));
        else if(choice == 3)
            System.out.println("Result = " + (a * b));
        else if(choice == 4)
            System.out.println("Result = " + (a / b));
        else
            System.out.println("Invalid Choice");

        sc.close();
    }
}