//Function to find Factorial

package Day_11;
import java.util.Scanner;

public class Question_44 {
    public static int fact_(int x){
        int fact = 1;
        for(int i = 1;i<=x;i++){
            fact*=i;
            
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fact_(a));
        sc.close();
    }
    
    
}
