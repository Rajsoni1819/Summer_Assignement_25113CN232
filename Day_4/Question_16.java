package Day_4;

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();

        System.out.println("Armstrong Numbers:");
        
        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;
            int digits = String.valueOf(num).length(); 
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits); 
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}   