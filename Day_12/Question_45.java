// Function for palindrome

package Day_12;
import java.util.Scanner;

public class Question_45 {
    public static void palindrome(int x){
        int rev = 0;
        int num = x;
        while(x!=0){
            int rem = x%10;
            rev=rev*10+rem;
            x/=10;
        }
        if(num==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        palindrome(n);
    }
    
}
