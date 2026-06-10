// Linear Search
package Day_14;

import java.util.Scanner;

public class Question_53 {
    public static void main(String[] args) {
        int n = 0;
        int i = 0;
        int key=0;
        int found = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbeer of Elements : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+" Element : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key element :");
        key = sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==key){
                found = found+1;
                break;
            }

        }
        if(found==1){
            System.out.println("Element found in "+i+" index");
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }

}
