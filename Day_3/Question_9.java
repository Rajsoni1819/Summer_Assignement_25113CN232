// Check whether given number is prime or not ?

package Day_3;

import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args){

        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prime = 1;
        if(n==1 || n==0){
            prime = 0;
        }
        else{
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    prime = 0;
                    break;
                }
                
            }
        }
        if(prime==0){
            System.out.println("Not prime");
        }
        else{
            System.out.println("Prime");
        }

    }
    
}
