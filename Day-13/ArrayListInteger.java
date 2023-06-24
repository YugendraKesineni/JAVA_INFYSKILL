import java.util.*;
public class ArrayListInteger {
    public static void main(String[] args){
        ArrayList<Integer> myIntegers = new ArrayList<Integer>();
        ArrayList<Integer> yourIntegers = new ArrayList<Integer>();

        yourIntegers.add(200);

        yourIntegers.add(300);

        myIntegers.add(10);

        myIntegers.add(20);

        myIntegers.add(30);

        myIntegers.addAll(2, yourIntegers);

        System.out.println("The value of 100 is ? " + myIntegers.contains(100));
        myIntegers.add(1,100);

        System.out.println("The value of 100 is ? " + myIntegers.contains(100));
        myIntegers.remove(1);

        System.out.println("The value of 30 is ? " + myIntegers.contains(30));
        System.out.println("The value of 100 is ? " + myIntegers.contains(100));

        Iterator iterator = myIntegers.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.println("My elements are printed");
        }
    }

