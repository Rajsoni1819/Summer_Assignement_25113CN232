//Binary to Decimal

package Day_6;

import java.util.*;

public class Question_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int decimal = 0;
        int i = 0;
        
        while (x > 0) {
            int rem = x % 10;
            decimal += rem * (int) Math.pow(2, i);
            x = x / 10;
            i++;
        }
        
        System.out.println("Decimal: " + decimal);
        sc.close();
    }
}   