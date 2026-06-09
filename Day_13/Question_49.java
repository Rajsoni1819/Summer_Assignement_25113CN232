// Program to input and display array
package Day_13;
import java.util.Scanner;

public class Question_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        for(i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"st "+"Element");
            arr[i]=sc.nextInt();
        }
        for( i= 0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    
}
