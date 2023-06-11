import java.util.Scanner;
public class multiDimenstion{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No. of Rows ");
        int rows = sc.nextInt();

        System.out.print("Enter No. of Columns");
        int columns = sc.nextInt();

        // Matrix 1

        //matrix 2
        int matrix[][] = new int[rows][columns];
        
        //Storing the values in the matrix

        for(int row = 0; row < rows; row++){
            // for Every row
            System.out.println("You are now adding values to the row " + row);

            for(int column = 0; column < columns; column++){
                System.out.print("Enter row " + row + " Column " + column);
                matrix[row][column] = sc.nextInt();

            }

        }
        for(int i = 0; i< 3; i++){
            for(int j = 0; j < 3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}