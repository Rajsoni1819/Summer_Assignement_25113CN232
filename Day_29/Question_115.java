// Q115 Write a program to Create Menu Driven String Operations System.
package Day_29;

import java.util.Scanner;

public class Question_115 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("===== STRING OPERATIONS =====");
        System.out.println("1. Convert to Uppercase");
        System.out.println("2. Convert to Lowercase");
        System.out.println("3. Find Length");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if(choice == 1){

            System.out.println(str.toUpperCase());

        }
        else if(choice == 2){

            System.out.println(str.toLowerCase());

        }
        else if(choice == 3){

            System.out.println("Length = "+str.length());

        }
        else{

            System.out.println("Invalid Choice");

        }

        sc.close();
    }
}