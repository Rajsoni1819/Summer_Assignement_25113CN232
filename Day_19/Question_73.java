// Add Matrices
package Day_19;
import java.util.*;
public class Question_73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of row of first array:");
        int r1 = sc.nextInt();
        System.out.println("Enter number of columns of first array");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        int i,j=0;
        for(i = 0;i<r1;i++){
            for(j=0;j<c1;j++){
                arr1[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("Enter number of rows of second array :");
        int r2 = sc.nextInt();
        System.out.println("Enter number of columns of second array :");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r2;i++){
            for(j=0;j<c2;j++){
                System.out.println(arr1[i][j]+arr2[i][j]);
            }
        }
       
        sc.close();




    }
    
}
