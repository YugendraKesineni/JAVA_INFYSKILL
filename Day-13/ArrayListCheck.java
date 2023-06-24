import java.util.*;
public class ArrayListCheck{

    public static void main(String[] args){

        ArrayList<String> myArrayList = new ArrayList<String>();

        myArrayList.add("Hello");
        myArrayList.add("Ruhi");
        myArrayList.add("JAVA");

        Iterator iterator = myArrayList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        }


    }
