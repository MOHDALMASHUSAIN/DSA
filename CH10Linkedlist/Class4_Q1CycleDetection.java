package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;
public class Class4_Q1CycleDetection {
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
        Node current = null;
        if (current.next.next==current) {
            System.out.println("cycle");
        }
    }
}
