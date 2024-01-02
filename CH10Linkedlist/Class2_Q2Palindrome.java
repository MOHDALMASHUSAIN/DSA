package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;
public class Class2_Q2Palindrome {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements(enter -1 to stop)");
        int element = 0;
        while (true) {
            element = sc.nextInt();
            if (element==-1) {
               break; 
            } 
            list.add(element);           
        }
        for (int i = 0,j=list.size()-1;i<list.size()/2 ; i++,j--){
            if (list.get(i)!=list.get(j)) {
                System.out.println("not palindrome");
                break;
            }
           
        }
         System.out.println("palindrome");
           sc.close(); 

    }
}
