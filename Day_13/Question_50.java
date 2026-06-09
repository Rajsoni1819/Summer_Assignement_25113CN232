package Day_13;
import java.util.Scanner;

public class Question_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        double average = (double) sum / n;
        
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
        sc.close();
    }
}   