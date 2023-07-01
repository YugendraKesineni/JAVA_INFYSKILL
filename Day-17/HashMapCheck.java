import java.util.*;

public class HashMapCheck {
    public static void main(String[] args){

        HashMap<Integer,String> myHashMap = new HashMap<Integer,String>();

        //Put method is used to add a key value pair
        myHashMap.put(20, "Priya");
        myHashMap.put(10,"Anuhya");
        myHashMap.put(1,"Geetha");
        myHashMap.put(2, "Arun");
        myHashMap.put(3, "Nishira");
        myHashMap.put(4,"Faridha");

        //removing entries from our hashmap
        // remove(key)
        // remove(key, value)
        
        myHashMap.remove(20,myHashMap.get(20));
        myHashMap.replace(4,"Ayesha");

        for(Map.Entry myPair : myHashMap.entrySet()){
            System.out.println(myPair.getKey() + " " + myPair.getValue());
        }
    }
}
