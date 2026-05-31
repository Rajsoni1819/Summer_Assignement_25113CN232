package Day_4;
import java.util.Scanner;

public class Question_14 {
    public static void main(String[] args) { 
        System.out.println("Enter nth term :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int current = 0;

            for (int i = 1; i < n; i++) { 
                current = first + second;
                first = second;
                second = current;
            }
        
        System.out.println(current);
        sc.close();
    }
}   