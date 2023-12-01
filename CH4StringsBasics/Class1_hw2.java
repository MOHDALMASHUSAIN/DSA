//QUES-User Input-"______".find the length of string without using .length()
package CH4StringsBasics;

import java.util.Scanner;

public class Class1_hw2 {
    public static void main(String[] args) {
   
 System.out.println("enter the Letter :" );
 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
 int count = 0;
 while(str == " "){
  
   str = str.substring(1);
   count =count + 1;
 }  
 System.out.println(count);
  }   
}
