import java.util.LinkedList;
import java.util.Queue;

//for a queue, the first element in is also the first element out
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
        
        //try out the poll method, which returns null instead of no such element exception
        String aQueuePoll = aQueue.poll();
        System.out.println("I will remove the first element, which is " +aQueuePoll +", and the new queue would be "+ aQueue);
        //removes the first element in, and returns it
        
        //I can also check for if an element is present in the queue
        String isIn = "Yilong Sun";
        
        if (aQueue.contains(isIn)){
        	System.out.println("The queue contains "+isIn);
        } else{
        	System.out.println("The queue does not contain" + isIn);
        }
        
        //using element() or peek() will look at the first element in the queue and return it witohut removing it
        //both these two lines should return the same answer
        System.out.println("The first element is "+aQueue.peek());
        System.out.println("The first element is "+aQueue.element());
        
    }
}