// Second largest Element
package Day_14;
import java.util.Scanner;
import java.util.Arrays;
public class Question_55 {
    public static void main(String[] args) {
        int n = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements :");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" element of array");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-2]);
    }
    
}
