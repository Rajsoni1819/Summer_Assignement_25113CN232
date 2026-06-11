
// Move zeroes to end

package Day_15;
import java.util.Scanner;
import java.util.Arrays;

public class Question_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.println("Enter " + (i + 1) + " Element");
            arr[i] = sc.nextInt();
        }
        
        int[] newArr = new int[n];
        int index = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                newArr[index] = arr[i];
                index++;
            }
        }
        
        for(int i = 0; i < n; i++){
            arr[i] = newArr[i];
        }
        
        System.out.println("Array after moving zeroes : " + Arrays.toString(arr));
        sc.close();
    }
}   