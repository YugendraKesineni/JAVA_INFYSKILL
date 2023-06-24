import java.util.*;
public class TreeSetCheck {
    public static void main(String[] args){

        TreeSet<String> myTreeSet = new TreeSet<>();

        myTreeSet.add("Yugendra");
        myTreeSet.add("Jaswant");
        myTreeSet.add("Arun");
        myTreeSet.add("Karishma");

        Iterator iterator = myTreeSet.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
