import java.util.*;
public class LinkedListInteger {
    public static void main(String[] args){

        LinkedList<Integer> myIntegers = new LinkedList<Integer>();
        myIntegers.add(10);
        myIntegers.add(20);

        
        System.out.println("My Integer at Index 1 is : " + myIntegers.get(1));
        for(Integer mInteger : myIntegers){
            System.out.println(mInteger);

        }

    }
}
