//Check armstrong number 

package Day_4;
import java.util.*;

public class Question_15 {
    public static void main(String[] args)
{
    System.out.println("Enter the number :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int digits = String.valueOf(n).length();
    int num = n;

    while(n!=0){
        int rem = n%10;
        n = n/10;
        sum += Math.pow(rem,digits);

    }
    if(num==sum){
        System.out.println( "Armstrong");
    }
    else{
        System.out.println("Not Armstrong");
    }
    sc.close();

}    
}
