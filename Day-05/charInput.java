import java.util.Scanner;

public class charInput {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a character : ");
        char myChar = sc.next().charAt(0);

        System.out.println("My Input is :" + myChar);
    }
}
