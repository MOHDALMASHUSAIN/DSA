package CH2ArrayMedium;

import java.util.Scanner;

public class Class3_HWQ5isSymmetric {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row = sc.nextInt();
         System.out.println("enter the no of col");
        int col =sc.nextInt();
          int arr[][] = new int[row][col];
          for(int i=0;i<row;i++ ){
            for(int j=0;j<col;j++){
                arr[i][j] =sc.nextInt();
            }
          }
          for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==arr[j][i]){
                 System.out.println(" symmertic");
                }
            }
          }

    }
}
