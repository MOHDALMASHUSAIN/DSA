package CH7Stack;

import java.util.Scanner;
import java.util.Stack;

public class Class2_Q2deleteMiddleElement {
    public static void main(String[] args) {
        Stack <Integer> deleteMiddleElement = new Stack<>();
        Scanner sc = new Scanner(System.in);
      System.out.println("enter total no of elements in the stack-:N"); 
      int  N = sc.nextInt();
      System.out.println("now push the elements of the stacks ");
      for(int i = 0;i<N;i++){
       deleteMiddleElement.push(sc.nextInt());
      }

      Stack <Integer> Temporary = new Stack<>();
      int n = deleteMiddleElement.size();
      for (int i = 0; i <n/2; i++) {
        Temporary.push(deleteMiddleElement.pop());
      }
      deleteMiddleElement.pop();
      for (int i = 0; i <=Temporary.size(); i++) {
        deleteMiddleElement.push(Temporary.pop());
      }
      for (int i = 0; i <deleteMiddleElement.size(); i++) {
        System.out.print(deleteMiddleElement.elementAt(i) + " ");
      }
    }
    
}
