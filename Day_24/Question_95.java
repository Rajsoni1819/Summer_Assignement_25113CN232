// Find longest word in sentence :

package Day_24;

import java.util.Scanner;

public class Question_95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest Word = " + longest);

        sc.close();
    }
}

