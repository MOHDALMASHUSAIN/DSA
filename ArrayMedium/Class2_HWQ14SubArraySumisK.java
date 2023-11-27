package ArrayMedium;

import java.util.Scanner;

public class Class2_HWQ14SubArraySumisK {
    public static void main(String[] args) {
         Scanner sc  =new Scanner(System.in);
        System.out.println("enter the no of elements of the array");
        int n = sc.nextInt();
        int arr[]=new int [n];
        System.out.print("elements of the array is:: ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("sum of the Kth numbers are --");
        

           

          sc.close();
    }
    
}
