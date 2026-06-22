// Q104 Write a program to Create Quiz Application.
package Day_26;

import java.util.Scanner;

public class Question_104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("===== Java Quiz =====");

        // Question 1
        System.out.println("\nQ1. Which keyword is used to create an object?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. static");
        System.out.println("4. public");
        System.out.print("Answer: ");
        int ans = sc.nextInt();

        if (ans == 2)
            score++;

        // Question 2
        System.out.println("\nQ2. Java is?");
        System.out.println("1. Platform Independent");
        System.out.println("2. Platform Dependent");
        System.out.println("3. Operating System");
        System.out.println("4. Compiler");
        System.out.print("Answer: ");
        ans = sc.nextInt();

        if (ans == 1)
            score++;

        // Question 3
        System.out.println("\nQ3. Which method is the entry point of Java program?");
        System.out.println("1. start()");
        System.out.println("2. run()");
        System.out.println("3. main()");
        System.out.println("4. init()");
        System.out.print("Answer: ");
        ans = sc.nextInt();

        if (ans == 3)
            score++;

        System.out.println("\nYour Score: " + score + "/3");

        sc.close();
    }
}