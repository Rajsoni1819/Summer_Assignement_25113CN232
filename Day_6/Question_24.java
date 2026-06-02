//Calculate x^n without pow()

package Day_6;
import java.util.Scanner;
public class Question_24 {
    public static void main(String[] args){
        System.out.println("Enter base :");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Enter power :");
        int p = sc.nextInt();
        int count=1;
        for(int i=1;i<=p;i++){
            count*=b;
            
    }
    System.out.println(count);
    sc.close();
    
    }
}