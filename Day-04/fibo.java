// Importing Scanner to take user input

import java.util.Scanner;


public class fibo{

    // Main function
    public static void main(String[] args){

        //Calling sc to take input from user
        Scanner sc = new Scanner(System.in);

        // Asking user for n 
        int nfibo = sc.nextInt();

        // Asking user for index
        int index = sc.nextInt();

        // Declaring an array of size nfibo = 15
        int fibo[] = new int[nfibo];

        
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i < nfibo; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for(int i = 0; i <nfibo; i++){
            System.out.print(fibo[i] + " ");
        }
        System.out.println();
        System.out.println("Your indexed Fibonacci Number is "+ fibo[index]);
    }
}