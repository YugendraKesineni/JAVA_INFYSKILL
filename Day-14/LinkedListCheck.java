import java.util.*;

public class LinkedListCheck {
    
    public static void main(String[] args){

        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("Jaswant");

        myLinkedList.add("Anuhya");
        myLinkedList.add("Geetha");

        myLinkedList.remove(myLinkedList.size() - 1);

        Iterator iterator = myLinkedList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
