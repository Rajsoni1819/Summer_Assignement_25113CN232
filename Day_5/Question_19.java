//Factors of a number

package Day_5;
import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }  
        sc.close();
    }    
}
