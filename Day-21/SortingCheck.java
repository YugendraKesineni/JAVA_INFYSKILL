// Importing Comparable from java.lang
import java.lang.Comparable;

/*
 * Main Class to check
 */
public class SortingCheck {
    public static void main(String[] args) {

        // Creating an Integer array
        Integer[] myIntegers = {20,30,10,5,4,100};

        //Sorting an Integer array using sorts method
        sorts(myIntegers);

        // Creating a character array
        Character[] myCharacters = {'A' , 'a', 'B', 'b' ,'H','h','C','c'};

        //Sorting an character array using sorts method
        sorts(myCharacters);

        String[] myStrings = {
            "Yugendra",
            "Jaswant",
            "Anuhya",
            "Balu",
            "Ashok"
        };
        sorts(myStrings);




        
    }

    /**
     * 
     * @param <V> Generic datatype
     * @param myIntegers local variable for sorting
     */
    public static <V extends Comparable<V> > void sorts(V[] myIntegers){

        // For sorting the array
        for(int i = 0; i < myIntegers.length ; i++){

            for (int j = 0; j < (myIntegers.length - i - 1) ; j++){

                if(myIntegers[j].compareTo(myIntegers[j + 1]) > 0){
                    swap(j, j + 1, myIntegers);

                }
            }
        }

        // For printing the sorted array using for loop
        for (V myElement : myIntegers){
            System.out.print(myElement + " ");
        }
        System.out.println();
    }

    // For swapping the values
    /**
     * 
     * @param <V> Generic datatype
     * @param i starting index
     * @param j ending index
     * @param myIntegers array for swapping indexes
     */
    public static <V> void swap(int i, int j, V[] myIntegers){
            V temp = myIntegers[i];
            myIntegers[i] = myIntegers[j];
            myIntegers[j] = temp;
        }
}
