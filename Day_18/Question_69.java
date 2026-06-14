//Bubble sort
package Day_18;
import java.util.*;
public class Question_69 {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            
        }

        for(i = 0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }

        }
        for(i =0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }


}
