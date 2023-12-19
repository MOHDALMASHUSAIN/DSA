package CH7Stack;
import java.util.Scanner;
import java.util.Stack;

public class Class3_Q3Sort {
    public static void main(String[] args) {
        

        
    }

}



      /*   USING NESTED LOOP
      Stack <Integer>stack2 = new Stack<>();
      int value = Integer.MIN_VALUE;
      for (int i = 0;  i<stack1.size(); i++) {
       for (int j = 0; j< stack1.size(); j++) {
        if(stack1.elementAt(i)>=value){
          value =stack1.elementAt(i);
        }
        stack2.push(value) ;
        stack1.push(Integer.MAX_VALUE);
       }
      }
      System.out.println("sorted stack" + value);
      */
      
      /* 
     Stack <Integer>stack2 = new Stack<>();
     stack2.push(stack1.peek());
     for (int i = 0; i < stack1.size()-1; i++) {
       if (stack1.peek()<stack2.peek()){
        stack2.push(stack1.peek());
       }
       else if (stack1.peek()>stack2.peek()) {
        while (stack1.peek()>stack2.peek()) {
          stack1.push(stack2.peek());
          
        }
        
       }
       System.out.println(stack2);

     }
     */

    
  
    

