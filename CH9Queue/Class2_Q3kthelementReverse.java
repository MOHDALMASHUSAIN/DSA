package CH9Queue;
import java.util.Queue;
import java.util.LinkedList;

public class Class2_Q3kthelementReverse {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        Queue<Integer>tempQueue1 = new LinkedList<>();        
        Queue<Integer>tempQueue2 = new LinkedList<>();
        Queue<Integer>tempQueue3 = new LinkedList<>();
        int k = 3;
                           
        for (int i= 0; i < k; i++) {
             tempQueue1.offer(queue.poll());  
        }               
        while (!queue.isEmpty()) {
            tempQueue2.offer(queue.poll());      
        }
        
   
    }
    
}
