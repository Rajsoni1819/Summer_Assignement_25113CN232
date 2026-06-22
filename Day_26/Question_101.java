// Q101 Write a program to Create Number Guessing Game.
package Day_26;

import java.util.Random;
import java.util.Scanner;

public class Question_101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;

        System.out.println("===== Number Guessing Game =====");

        do {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too High!");
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }

        } while (guess != number);

        sc.close();
    }
}