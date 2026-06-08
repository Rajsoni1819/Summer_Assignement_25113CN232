//Function for Armstrong

package Day_12;
import java.util.*;
public class Question_46 {
    public static void Armstrong(int x){
        int count = 0;
        double sum = 0;
        
        int rem =0;
        while(x!=0){
            x = x/10;
            count++;
        }
        int num = x;
        while(x!=0){
            rem = x%10;
            sum = sum+Math.pow(rem,count);
            x=x/10;

        }
        if(sum==num){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Armstrong(n);
        sc.close();
    }
    
}
