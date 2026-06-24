// Q110 Write a program to Create Bank Account System.
package Day_28;

import java.util.Scanner;

public class Question_110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.println("===== Bank Account System =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.println("Balance: ₹" + balance);
        }
        else if(choice == 2) {
            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            balance += amount;
            System.out.println("Updated Balance: ₹" + balance);
        }
        else if(choice == 3) {
            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            if(amount <= balance) {
                balance -= amount;
                System.out.println("Updated Balance: ₹" + balance);
            }
            else {
                System.out.println("Insufficient Balance!");
            }
        }
        else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}