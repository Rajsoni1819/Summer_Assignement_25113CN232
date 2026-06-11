// Rotate array right
package Day_15;
import java.util.Scanner;
import java.util.Arrays;

public class Question_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter number of positions to rotate right :");
        int d = sc.nextInt();
        d = d % n; 
        
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        
        System.out.println("Rotated Array : " + Arrays.toString(arr));
        sc.close();
    }
    
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}   
