package Day_5;
import java.util.Scanner;
public class Question_18{
    public static int fact(int x){
        int fact =1;
        for(int i =1;i<=x;i++){
            fact *=i;
        }
        return fact;
    }
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=n;
        while(n!=0){
            int rem = n%10;
            sum+=fact(rem);
            n=n/10;

        }
        if(sum==num){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not strong number");
        }
        sc.close();
    }
}