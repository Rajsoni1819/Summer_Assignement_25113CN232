//Function to find maximum Number :
package Day_11;
import java.util.*;

public class Question_42 {
    public static int max_(int p,int q){
        int max=Math.max(p,q);
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        System.out.println("Maximum number is "+max_(a,b));

        
    }
    
}
