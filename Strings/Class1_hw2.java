//QUES-User Input-"Hello".find the length of string without using .length()
package Strings;

import java.util.Scanner;

public class Class1_hw2 {
    public static void main(String[] args) {
   
 System.out.println("enter the Letter :" );
 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
   System.out.println("length of String is "+(str.lastIndexOf('o')+1));
sc.close();
  }   
}
