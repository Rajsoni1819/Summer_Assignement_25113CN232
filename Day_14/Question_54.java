// Frequency of array :

package Day_14;
import java.util.Scanner;

public class Question_54 {
    public static void main(String[] args) {
        int n = 0;
        int key = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter number of elements :");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" Element of array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Key :");
        key = sc.nextInt();
        for(i = 0;i<n;i++){
            if(key==arr[i]){
                count++;
            }
        }
        System.out.println("Frequency of "+key+" is "+count);
        sc.close();
    }

    
}
