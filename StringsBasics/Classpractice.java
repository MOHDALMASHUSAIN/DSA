package StringsBasics;

public class Classpractice {
    public static void main(String[] args) {
       String s = "mohd almas husain " ;
       for (int i =0;i<s.length();i++){
        if(s.charAt(i)==' '){
          s.charAt(i)=-1;
        }
        
       }
    }
}
