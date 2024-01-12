package CH10Linkedlist;
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLL {
    static Node head;

    public CircularLL() {
        head = null;
    }

    static void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }
}

public class Class4_Q7SplitCircular {
    public static void main(String[] args) {
        
    }
}
