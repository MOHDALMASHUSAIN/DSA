package CH10Linkedlist;
import java.util.LinkedList;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(60);
        Stack<Integer>stack = new Stack<>();
       for (int i = 0; i < list.size(); i++) {
        stack.push(list.get(i))

        
       }
        System.out.println(list);
        for (int i = list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }

    }    
}
