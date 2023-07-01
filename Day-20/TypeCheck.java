import java.util.Scanner;
public class TypeCheck {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

    

        // Method overloading 
        System.out.println("Integers Sum");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int total(int a, int b){
            return a + b;
        }
        System.out.println(total(2 , 3));

        double c = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.println("Doubles sum");
        double total(double c, double d) {
            return c + d;
        }

        System.out.println(total(2.5, 3.5));
        float e = sc.nextFloat();
        float f = sc.nextFloat();

        System.out.println("Float sum");
        float total(float e, float f) {
            return e + f;
        }

        System.out.println(total(3.1,2));



    }
}
