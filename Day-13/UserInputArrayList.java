import java.util.*;


public class UserInputArrayList {
    public static void main(String[] args){

        System.out.println("Enter number of Integers");
        Scanner sc = new Scanner(System.in);

        // Taking integer input from the user
        int n = sc.nextInt();
        ArrayList<Integer> scores = new ArrayList<Integer>();

        System.out.println(scores.isEmpty());

        for(int i = 0; i < n; i++){
            System.out.print("Enter element " );
            int element = sc.nextInt();
            scores.add(element);
        }

        

        System.out.println("Have you missed adding any Element ?");
        System.out.println("Add element at the beginning");
        int element = sc.nextInt();
        scores.add(0,element);

        System.out.println("Do you want to add element at any index ?");
        System.out.println("Enter the index value ");
        int indexNumber = sc.nextInt();

        System.out.println("Enter the value to add ");
        element = sc.nextInt();

        scores.add(indexNumber,element);

        Iterator iterator = scores.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println(scores.isEmpty());


    }
}
