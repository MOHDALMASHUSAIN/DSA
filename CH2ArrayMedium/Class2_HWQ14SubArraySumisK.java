package CH2ArrayMedium;
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
        System.out.println("Enter the sum --");
        int k =sc.nextInt();
        int max =0,start =0,end=0; 
       
        for(int i=0;i<arr.length;i++){  
        for(int j =0;j<arr.length;j++){
         
          max +=arr[j];
          if(max==k){
            start =i;
            end = j;
          }
         
        }
        for (int l = start;l<=end;l++){
        System.out.print(arr[l]);

         }  

         
        }
        
        
          sc.close();
    }
    
}
