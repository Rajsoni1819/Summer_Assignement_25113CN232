// First Non repeating character
package Day_23;

import java.util.Scanner;

public class Question_89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ')
                continue;

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j))
                    count++;
            }

            if (count == 1) {
                System.out.println("First Non-Repeating Character = " + ch);
                break;
            }
        }

        sc.close();
    }
}