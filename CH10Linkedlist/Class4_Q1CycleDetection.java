package CH10Linkedlist;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    public static Node head;

    public LinkedList() {
        this.head = null;
    }
    static void append(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }
}
public class Class4_Q1CycleDetection {
    static boolean cycle()
    public static void main(String[] args) {
        // LinkedList<Integer>list = new LinkedList<>();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the elements(enter -1 to stop)");
        // int element = 0;
        // while (true) {
        //     element = sc.nextInt();
        //     if (element==-1) {
        //        break; 
        //     } 
        //     list.add(element);           
        // }
        // Node current = null;
        // if (current.next.next==current) {
        //     System.out.println("cycle");
        // }
    }
    




}
