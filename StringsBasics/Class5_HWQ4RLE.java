package StringsBasics;

import java.util.Scanner;

public class Class5_HWQ4RLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String Str = sc.nextLine();
       char arr[] = Str.toCharArray();
       for (int i = 0;i<arr.length-1;i++){
        int count =1;
         for (int j = i+1;j<arr.length;j++){
           if(arr[i]==arr[j]){
            count ++;
            i=j;
           }
         }
        
          System.out.print(arr[i]+" "+ count+" ");
      }
      sc.close();

    }
}
