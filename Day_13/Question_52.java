//Even and odd count

package Day_13;
import java.util.Scanner;

public class Question_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int evenCount = 0;
        int oddCount = 0;
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Even Elements : " + evenCount);
        System.out.println("Odd Elements : " + oddCount);
        sc.close();
    }
}