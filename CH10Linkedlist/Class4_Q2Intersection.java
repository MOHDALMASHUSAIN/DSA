package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;

public class Class4_Q2Intersection {
    public static void main(String[] args) {
        LinkedList<Integer>list1 = new LinkedList<>();
        LinkedList<Integer>list2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements(enter -1 to stop)");
        int element1 = 0;
        while (true) {
            element1 = sc.nextInt();
            if (element1==-1) {
               break; 
            } 
            list1.add(element1);           
        }
        System.out.println("enter the elements(enter -1 to stop)");
        int element2 = 0;
        while (true) {
            element2 = sc.nextInt();
            if (element2==-1) {
               break; 
            } 
            list2.add(element2);           
        }
        for (int i = 0; i <list1.size(); i++) {
            for (int j = 0; j <list2.size() ; j++) {
                if () {
                    
                }
                
            }
        }

    }
}
