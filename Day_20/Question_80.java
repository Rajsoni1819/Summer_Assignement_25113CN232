package Day_20;
import java.util.*;
public class Question_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();
        
        int[][] arr = new int[r][c];

        System.out.println("Enter elements of matrix:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Column wise sum:");
        for(int j = 0; j < c; j++){
            int colSum = 0;
            for(int i = 0; i < r; i++){
                colSum += arr[i][j];
            }
            System.out.println("Sum of Column " + (j + 1) + ": " + colSum);
        }
        
        sc.close();
    }
}   