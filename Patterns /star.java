
import java.util.Scanner;
public class star {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();

        for(int row = rows; row >= 0; row--){
            for(int col = 1; col <= row; col++){

                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
    }
}
