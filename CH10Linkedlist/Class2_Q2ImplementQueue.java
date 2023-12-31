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

   
   /*  static int  delete(){
        if(head == null){
            return 1;
        }
            head = head.next;
            
            return -1; 
        }
        /* 
        Node current = head;

        while(current.next!= null && current.next.data !=data){
            current = current.next;
        }

        if(current.next!=null){
            current.next = current.next.next;
        }
        */        
    }

public class Class2_Q2ImplementQueue {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(10);        
        list.append(20);
        list.append(30);       
        //System.out.println(list.delete());
     
    }
    
}
