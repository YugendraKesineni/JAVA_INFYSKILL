import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
public class operators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Integer ");
        int myInt1 = sc.nextInt();
        System.out.print("Enter Second Integer ");
        int myInt2 = sc.nextInt();

        boolean result = myInt1 != myInt2;

        System.out.println("The result is " + result);

    }
}
