package CH7Stack;
import java.util.Scanner;
import java.util.Stack;
public class Class2_Q3REVERSEthestack {
    public static void main(String[] args) {
         Stack <Integer> stack = new java.util.Stack<>();
      Scanner sc = new Scanner(System.in);
      System.out.println("enter total no of elements in the stack-:N"); 
      int  N = sc.nextInt();
      System.out.println("now push the elements of the stacks ");
      for(int i = 0;i<N;i++){
        stack.push(sc.nextInt());
      }
      int arr[] = new int[N];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = stack.pop();
    }
    for (int i = 0; i < arr.length; i++) {
        stack.push(arr[i]);
    }
    for (int i = 0; i < stack.size(); i++) {
        System.out.print(stack.elementAt(i) + " ");
    }
     










        
    }
    
}
