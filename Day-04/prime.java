import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int checkPrime = sc.nextInt();
        boolean match = true;
            for(int i = 2; i<checkPrime; i++){
            if(checkPrime % i == 0){
                match = false;
                break;
            }
        }
        if(match){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}