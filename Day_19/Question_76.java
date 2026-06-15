//Diagonal Sum
package Day_19;
import java.util.*;
public class Question_76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows (and columns) for square matrix:");
        int n = sc.nextInt();
        
        int[][] arr = new int[n][n];

        System.out.println("Enter elements of matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("Sum of Principal Diagonal: " + sum);
        
        sc.close();
    }
}   