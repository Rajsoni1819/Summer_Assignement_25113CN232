// First Repeating Character
package Day_23;

import java.util.Scanner;

public class Question_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ')
                continue;

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    System.out.println("First Repeating Character = " + ch);
                    return;
                }
            }
        }

        System.out.println("No Repeating Character Found.");

        sc.close();
    }
}