// Q114 Write a program to Create Menu Driven Array Operations System.
package Day_29;

import java.util.Scanner;

public class Question_114 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {10,20,30,40,50};

        System.out.println("===== ARRAY OPERATIONS =====");
        System.out.println("1. Display Array");
        System.out.println("2. Find Sum");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        if(choice == 1){

            System.out.println("Array Elements:");

            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

        }
        else if(choice == 2){

            int sum=0;

            for(int i=0;i<arr.length;i++){
                sum += arr[i];
            }

            System.out.println("Sum = "+sum);

        }
        else{

            System.out.println("Invalid Choice");

        }

        sc.close();
    }
}