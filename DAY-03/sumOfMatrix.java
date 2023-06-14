public class sumOfMatrix{
    public static void main(String[] args){

        // Taking an Array 1

        int array1[][] = new int[3][3];
        array1[0][0] = 10;
        int array2[][] = new int[3][3];
        array2[0][0] = 20;
        int result[][] = new int[3][3];

        for(int row = 0; row < array1.length; row++){

            for(int col = 0; col < array1[0].length;col++){

                result[row][col] = array1[row][col] + array2[row][col];
            }
        }

        // Printing the resultant matrix
        for(int row = 0; row < array1.length; row++){

            for(int col = 0; col < array1[0].length;col++){

                System.out.print(result[row][col]+ " ");
            }
            System.out.println();
        }
     }
}