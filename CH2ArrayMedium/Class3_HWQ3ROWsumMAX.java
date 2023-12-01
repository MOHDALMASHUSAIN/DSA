package CH2ArrayMedium;

import java.util.Scanner;

public class Class3_HWQ3ROWsumMAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row = sc.nextInt();
         System.out.println("enter the no of col");
        int col =sc.nextInt();
          int arr[][] = new int[row][col]; 
          System.out.println("Enter elements:");
          for (int i = 0; i < row; i++) {
              for (int j = 0; j < col; j++) {
                  arr[i][j] = sc.nextInt();
              }
          }
           int max =0;
         
          for(int i =0;i<row;i++){
              int sum =0;            
              for(int j =0;j<col;j++){
                sum = sum +arr[i][j];                             
              }
              if(sum>max){
                max =sum;
              }
          }
          System.out.println("max value of string is ::" + max);


       sc.close();
    }
}
