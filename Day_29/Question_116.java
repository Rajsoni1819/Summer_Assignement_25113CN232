// Q116 Write a program to Create Inventory Management System.
package Day_29;

import java.util.Scanner;

public class Question_116 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== INVENTORY MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Product");
        System.out.println("2. View Product");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if(choice == 1){

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            System.out.println("\nProduct Added Successfully!");
            System.out.println("Product : "+name);
            System.out.println("Quantity : "+qty);

        }
        else if(choice == 2){

            System.out.println("No Products Available.");

        }
        else{

            System.out.println("Invalid Choice.");

        }

        sc.close();
    }
}