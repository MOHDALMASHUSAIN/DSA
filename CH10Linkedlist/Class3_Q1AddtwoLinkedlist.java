package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Scanner;
public class Class3_Q1AddtwoLinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer>list1 = new LinkedList<>();
        LinkedList<Integer>list2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of Linkedlist1(-1 to stop)");
        int element1 =0;
        while (true) {
            element1=sc.nextInt();
            if (element1==-1) {
                break;
            }
            else{
                list1.add(element1);
            }                    
        }
        System.out.println("enter the elements of Linkedlist1(-1 to stop)");
        int element2=0;
        while (true) {
            element2=sc.nextInt();
            if (element2==-1) {
                break;
            }
            else{
                list2.add(element2);
            }                    
        }
        int i=Integer.parseInt(list1.toString());  
        int j = Integer.parseInt(list2.toString());
        int sum = i+j;
        System.out.println(i);

   

        
    }
}
