//Fibonacci upto n term
package Day_4;
import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args)
{
    System.out.print("Enter the number of terms : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int first = 0;
    int second = 1;
    int current = 0;
    System.out.println(first);
    for(int i=1;i<n;i++){
        first = second;
        second = current;
        current = first+second;
        System.out.println(current);

    }
    sc.close();


}    
}
