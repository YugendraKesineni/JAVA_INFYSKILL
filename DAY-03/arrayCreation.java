import java.util.Scanner;
public class arrayCreation{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // To take size of array from the user
        int n = sc.nextInt(); // Size of Array
        int scores[] = new int[n]; // Storage is being allocated to scores array variables to store n integers

        // To take n integers from the user
        for(int i = 0; i < n; i++){
            scores[i] = sc.nextInt(); // taking each input from user
        }

        // Scores array is now filled with n integers from the user
        

        // Accessing the values present in scores array
        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i]+" ");
        }
    }
}