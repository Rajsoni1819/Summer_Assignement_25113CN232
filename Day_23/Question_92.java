// Maximum Occuring Character
package Day_23;

import java.util.Scanner;

public class Question_92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        char maxChar = ' ';
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ')
                continue;

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j))
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
        }

        System.out.println("Maximum Occurring Character = " + maxChar);
        System.out.println("Frequency = " + maxCount);

        sc.close();
    }
}