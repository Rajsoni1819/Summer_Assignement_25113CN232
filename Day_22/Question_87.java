//Character frequency
package Day_22;

import java.util.Scanner;

public class Question_87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (ch == str.charAt(k)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                System.out.println(ch + " = " + count);
            }
        }

        sc.close();
    }
}