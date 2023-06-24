
import java.util.*;
public class HashSetCheck {
    
    public static void main(String[] args){

        HashSet<String> myHashSet = new HashSet<>();

        myHashSet.add("Arun");
        myHashSet.add("Jaswant");
        myHashSet.add("Jaswant");

        myHashSet.add("Shreya");

        myHashSet.add("Yugendra");

        Iterator iterator = myHashSet.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

    }
}
