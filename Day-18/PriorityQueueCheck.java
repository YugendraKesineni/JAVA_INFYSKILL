import java.util.*;

public class PriorityQueueCheck {
    
    public static void main(String[] args){

        PriorityQueue<String> mPriorityQueue = new PriorityQueue<>();

        mPriorityQueue.add("Yugendra");
        mPriorityQueue.add("Jaswant");
        mPriorityQueue.add("balu");

        
        
        System.out.println(mPriorityQueue.remove("arun"));
        Iterator iterator = mPriorityQueue.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
