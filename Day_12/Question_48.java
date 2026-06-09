// Function for perfect Number
package Day_12;
import java.util.*;

public class Question_48 {
    public static void Perfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not Perfect");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Perfect(n);
        sc.close();
    }
}   