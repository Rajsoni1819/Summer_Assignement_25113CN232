// Count words in a sentence
package Day_22;

import java.util.Scanner;

public class Question_86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        System.out.println("Number of words = " + words.length);

        sc.close();
    }
}