import java.util.*;

public class LinkedHashSetCheck {
    
    public static void main(String[] args){

        LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<>();

        myLinkedHashSet.add("Yugendra");
        myLinkedHashSet.add("Jaswant");
        myLinkedHashSet.add("Jaswant");
        myLinkedHashSet.remove("Jaswant");
        myLinkedHashSet.add("Arun");
        myLinkedHashSet.add("Shreya");

        Iterator iterator = myLinkedHashSet.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
