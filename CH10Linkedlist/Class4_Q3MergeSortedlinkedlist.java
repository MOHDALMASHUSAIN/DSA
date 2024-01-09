package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;
public class Class4_Q3MergeSortedlinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer>list1 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sorted elements(enter -1 to stop)");
        int element = 0;
        while (true) {
            element = sc.nextInt();
            if (element==-1) {
               break; 
            } 
            list1.add(element);           
        }
        LinkedList<Integer>list2 = new LinkedList<>();
        System.out.println("enter sorted elements (enter -1 to stop)");
        int element1 = 0;
        while (true) {
            element1 = sc.nextInt();
            if (element1==-1) {
               break; 
            } 
            list2.add(element1);           
        }
      

    }
}
