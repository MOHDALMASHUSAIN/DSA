package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class Class4_Q8Sort {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements(enter -1 to stop)");
        int element = 0;
        while (true) {
            element = sc.nextInt();
            if (element==-1) {
               break; 
            } 
            list.add(element);           
        }
        int temp;
         int min = Integer.MAX_VALUE;
        for(int i =0;i<list.size();i++){           
           for(int j =i+1;j<list.size();j++){
            if (list.get(j)<min) {
                min=list.get(j);
              
            }           
           
           }
           list.set(i, min);
        }
        System.out.println(list);
    }
}
