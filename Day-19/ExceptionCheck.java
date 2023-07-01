import java.io.IOException;
import java.util.Scanner;
public class ExceptionCheck {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numerator = sc.nextInt();
        int denominator = sc.nextInt();

        try{
        System.out.println("The quotient is " + (numerator / denominator));
        }
        catch (Exception e){
            System.out.println("My code ran perfect");
            System.out.println("My programm is executed successfully");
        }
        
        System.out.println("This is a class");

        
    }
}
