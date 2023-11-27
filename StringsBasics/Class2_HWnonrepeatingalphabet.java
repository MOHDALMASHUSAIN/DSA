package StringsBasics;

import java.util.Scanner;

public class Class2_HWnonrepeatingalphabet {
    static int nonrepeating(String str){
        for (int i = 0;i<str.length()-1;i++){
            for (int j = i+1;j<str.length()-1;j++){
                if(str.charAt(i) != str.charAt(j)){
                    return 1;
                }  }
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
       
        if(nonrepeating(str)==-1){
            System.out.println("no non repeating number");
        }
        else{
            System.out.println(str.charAt(i));
        }       
    }
}
