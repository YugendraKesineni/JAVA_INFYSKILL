import java.util.Scanner;
public class IF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myInt = sc.nextInt();

        if(myInt < 2){
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye");
        }
    }
}
