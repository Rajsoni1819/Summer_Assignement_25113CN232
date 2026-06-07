// Function to check if number is prime or not ?
package Day_11;
import java.util.Scanner;
public class Question_43 {
    public static int prime(int x){
        int prime=1;
        if(x<=0){
            System.out.println("Not prime");
        }
        else{
            for(int i =2;i<=x/2;i++){
                if(x%i==0){
                    prime=0;
                    break;
                }

            }
            if(prime==1){
                System.out.println("prime");
            }
            else{
                System.out.println("Not prime");
            }
            

        }
        return x;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(prime(a));
    }
    
    
}
