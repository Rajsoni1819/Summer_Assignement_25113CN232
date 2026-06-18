package Day_22;
import java.util.Scanner;

public class Question_85 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String : ");
    String str = sc.nextLine();
    String rev =" ";
    for(int i = str.length()-1;i>0;i--){
        rev = rev+str.charAt(i);
    }
    if(rev==str){
        System.out.println("palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }

    
}}

