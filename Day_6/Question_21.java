// Decimal to Binary

package Day_6;

import java.util.Scanner;

public class Question_21{
    public static void main(String[] args){
        System.out.println("Enter Decimal number :");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        String bin = "";

        while(n!=0){
            int rem = n%2;
            bin = rem+bin;
            n = n/2;

        }
        System.out.println(bin);
        sc.close();
    }

}