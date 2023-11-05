package Arrray;

public class Q10RotatebyOne {
    public static void main(String[] args) {
        int arr[] = {43,5,435,1,2,3};
        int temp = arr[arr.length-1];
       
        for (int i =0;i<arr.length-1;i++){
            arr[i+1] =arr[i];
        }
         arr[0] = temp;
        
     // System.out.print(arr[]); 
     //for (int i : arr) {
       
    // }

    }
}
