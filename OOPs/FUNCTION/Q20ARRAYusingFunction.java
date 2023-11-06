package OOPs.FUNCTION;

import java.util.Scanner;

public class Q20ARRAYusingFunction {
    static boolean sOrted(int arr[]){
        for(int j =0;j<arr.length;j++){
            if(arr[j]<arr[j+1]){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of element ");
        int n = sc.nextInt();
        int arr[]= new int [n];
        System.out.println("Elements of the arrays are");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sOrted(arr));
sc.close();
    }
    
}
