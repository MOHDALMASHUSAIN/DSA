package Arrray;

public class Q20SortedorNOT {
    public static void main(String[] args) {

        int arr[] = {12,54,56,233,65,762};
            for (int i =0;i<arr.length;i++){
                  if(arr[i] >arr[i+1]){
                  
                   System.out.println("not sorted");
                   break;
               }     
            
            }
        }
    }

