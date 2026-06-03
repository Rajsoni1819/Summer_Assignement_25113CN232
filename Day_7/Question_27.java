package Day_7;

// Question: Write a Java program to find the recursive sum of digits of a number taken from the user.

import java.util.Scanner;

public class Question_27 {

    public static int sumOfDigits(int n) {
        if (n < 0) return sumOfDigits(-n);
        if (n < 10) return n;
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = sumOfDigits(number);
        
        System.out.println("Sum of digits: " + result);
        
        scanner.close();
    }
}   