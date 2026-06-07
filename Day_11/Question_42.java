// Function to find Maximum
package Day_11;
import java.util.*;
public class Question_42 {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 for comparison btw 2 numbers and 3 for 3 numbers");
        int n = sc.nextInt();
        if(n==2){
            int a,b;
            System.out.println("Enter first Number :");
            a = sc.nextInt();
            System.out.println("Enter Second Number :");
            b = sc.nextInt();
            int max2 = Math.max(a,b);
            System.out.println("Maximum Number is "+max2);      
        }
        else if(n==3){
            int c,d,e;
            System.out.println("Enter first Number :");
            c = sc.nextInt();
            System.out.println("Enter Second Number :");
            d = sc.nextInt();
            System.out.println("Enter third number :");
            e = sc.nextInt();
            int max3=Math.max(c,Math.max(d,e));
            System.out.println("Maximum Number is "+max3);

        }
        else{
            System.out.println("wrong Choice !! ");
        }

    }
    
}
