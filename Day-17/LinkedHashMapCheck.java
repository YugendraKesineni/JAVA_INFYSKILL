
import java.util.*;
public class LinkedHashMapCheck {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,String> myLinkedHashMap = new LinkedHashMap<>();

        myLinkedHashMap.put(3,"Yugendra");

        // For taking number of students
        int N = sc.nextInt();

        int count = 1;
        for(int i = 1; i <= N; i++){
            System.out.print("Enter the Name of Student : ");
            String Name = sc.next();

            if(myLinkedHashMap.containsKey(i)){
                count++;
            }
            myLinkedHashMap.put(count, Name);
            count++;
        }

        for(Map.Entry myStudent : myLinkedHashMap.entrySet()){
            System.out.println(myStudent.getKey() + " " + myStudent.getValue());
        }
    }
}
