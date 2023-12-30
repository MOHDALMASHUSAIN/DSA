package CH10Linkedlist;
class Node{
    public int data;
    public Node next ;   
    public Node(int value){
        this.data = value;
        this.next=null;
    }                                                                                                                              
}
class LinkedList{
    public static Node head;
    public LinkedList(){
        this.head = null;
    }
     static void append( int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }
}    

public class Class2_Q2ImplementQueue {
    public static void main(String[] args) {
        
    }
    
}
