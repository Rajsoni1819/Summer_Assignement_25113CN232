// Largest and Smallest element of array

package Day_13;
import java.util.Scanner;

public class Question_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
        }
        
        int largest = arr[0];
        int smallest = arr[0];
        
        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        
        System.out.println("Largest Element : " + largest);
        System.out.println("Smallest Element : " + smallest);
        sc.close();
    }
}   