// program to reverse array
package Day_15;
import java.util.Scanner;
import java.util.Arrays;

public class Question_57 {
    public static void main(String[] args) {
        int n = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number of Elements :");
        n = sc.nextInt();
        
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(i = 0; i < n; i++){
            System.out.println("Enter " + (i + 1) + " Element of array");
            arr1[i] = sc.nextInt();
        }

        for(i = 0; i < n; i++){
            arr2[i] = arr1[n - 1 - i];
        }

        System.out.println("Reversed Array : " + Arrays.toString(arr2));
        sc.close();
    }
}   