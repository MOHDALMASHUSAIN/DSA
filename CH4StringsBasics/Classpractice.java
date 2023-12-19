   package CH4StringsBasics;

import java.util.Stack;

public class Classpractice {
  static boolean isvalidParenthesis(String parenthesis){
    if(parenthesis.length()%2!=0){
      return false;
    }
    Stack<Character> currentBracket = new Stack<>();
    for(int i = 0;i<parenthesis.length();i++){
       if (parenthesis.charAt(i)=='[' || parenthesis.charAt(i)=='(' || parenthesis.charAt(i)=='{' ) {
        currentBracket.push(parenthesis.charAt(i));
       }
       if (currentBracket.peek ==) {
        
       }

    } 
   

    
     



  }




  public static void main(String[] args) {
    //Stack <Integer>MyStack= new Stack<>(); 
  }    
  }