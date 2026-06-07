// Function to sum two numbers
package Day_11;
import java.util.Scanner;
public class Question_41 {
    public static int sum(int x,int y){
        return x+y;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        System.out.println("Sum is "+sum(a,b));
        sc.close();
    }
    
    
}
