  package CH4StringsBasics;

import java.util.Scanner;

public class Classpractice {
   
    static long hashcod(String str){
     long hC =0;
      for(int i = 0;i<str.length();i++){
    hC += str.charAt(i)*Math.pow(i, 2);
      }
     return hC;
   }
  
public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 System.out.println("enter the string s");
 String s = sc.nextLine();
 System.out.println("enter the patern : patt");
 String patt = sc.nextLine();
//  String sti = "Abbbc";
//  System.out.println(hashcod(sti));
long hashcodeofPattern =hashcod(patt);
for(int i = 0;i<=s.length()-patt.length();i++){
String subString =s.substring(i, i+patt.length());
long hashcodeofsubString = hashcod(subString);
if (hashcodeofPattern==hashcodeofsubString) {
   System.out.println("Index of repeatating pattern in substring "+i);
   
}
}
 sc.close();

} 
}


     

 