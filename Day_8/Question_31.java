/*
A
AB
ABC
ABCD
ABCDE 
*/

package Day_8;

public class Question_31 {
    public static void main(String[] args){
        for(char i ='A';i<='E';i++){
            for(char j ='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
