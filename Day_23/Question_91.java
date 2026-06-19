
// Anagram Strings
package Day_23;

import java.util.Arrays;
import java.util.Scanner;

public class Question_91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().replace(" ", "").toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().replace(" ", "").toLowerCase();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}