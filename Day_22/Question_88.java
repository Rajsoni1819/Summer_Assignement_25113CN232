package Day_22;

import java.util.Scanner;

public class Question_88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.replace(" ", "");

        System.out.println("String after removing spaces: " + result);

        sc.close();
    }
}