package Day_20;
import java.util.*;
public class Question_78 {
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

        boolean isSymmetric = true;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] != arr[j][i]){
                    isSymmetric = false;
                    break;
                }
            }
            if(!isSymmetric) break;
        }

        if(isSymmetric){
            System.out.println("Matrix is Symmetric");
        }
        else{
            System.out.println("Matrix is Not Symmetric");
        }
        
        sc.close();
    }
}   