import java.util.*;

public class NumberTreeSet {
    public static void main(String[] args){
    TreeSet<Integer> myIntegers = new TreeSet<>();

        myIntegers.add(13);
        myIntegers.add(17);
        myIntegers.add(1100);
        myIntegers.add(14);
        myIntegers.add(200);
        myIntegers.add(11);
        myIntegers.add(2000);

        Iterator iterator = myIntegers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
    }
}
}