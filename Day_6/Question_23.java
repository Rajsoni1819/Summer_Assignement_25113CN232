//Count set bits in a number

package Day_6;

import java.util.*;

public class Question_23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str="";
        int rem=0;
        int count=0;
        while(n!=0){
            rem = n%2;
            str=rem+str;
            if(rem==1){
                count++;
            }
            n=n/2;
        }
        System.out.println(count);
        


    }
    
}
