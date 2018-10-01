import java.util.LinkedList;
import java.util.Queue;

public class queueTest{
    
    public static void main(String[] args){
        //create a queue with linked list
        Queue<String> aQueue = new LinkedList<>();
        
        //adding elements to my queue
        aQueue.add("My name is");
        aQueue.add("Yilong Sun");
        aQueue.add("welcome to my queue");
        aQueue.add("Everyone please get in line");
        aQueue.add("First in, Last out!");
        
        //checking the elements in my queue
        System.out.println("Hello "+ aQueue);
        
        
        
        
        
        
    }
}