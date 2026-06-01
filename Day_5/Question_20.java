//Larget prime Factor

package Day_5;
import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int largestFactor = -1;
            
            for (int i = 2; i <= n; i++) {
                
                while (n % i == 0) {
                    largestFactor = i; // i is a prime factor
                    n = n / i;
                }
            }

            System.out.println("Largest Prime Factor: " + largestFactor);
        }
        sc.close();
    }
}   