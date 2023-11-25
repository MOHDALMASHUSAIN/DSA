package Arrray;

public class Q13NextSmaller {
    public static void main(String[] args) {
        int arr[] = {12,3,43,5,7,6};
       for (int i = 0;i<arr.length;i++){
        int count = 0;
        for (int j =0;j<arr.length;j++){
            if(j>i && arr[i] >arr[j]){
                count ++;
            } 
        }
        System.out.println("Nxt smaller element of" +arr[i] +" :" + count);
       }
       
    }
}
