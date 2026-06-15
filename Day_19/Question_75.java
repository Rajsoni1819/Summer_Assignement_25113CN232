// Transpose of Matrix
package Day_19;
import java.util.*;
public class Question_75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows of array:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns of array:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int[c][r];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpose of matrix:");
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}   