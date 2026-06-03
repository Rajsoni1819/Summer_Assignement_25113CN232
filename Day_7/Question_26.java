//Recursive Fibonacci
package Day_7;
import java.util.*;

public class Question_26 {

    public static int fib(int x){
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        else{
            return fib(x-1)+fib(x-2);
        }
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    
}
