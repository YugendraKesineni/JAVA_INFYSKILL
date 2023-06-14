import java.util.Scanner;

public class uptoPrime {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int checkPrime = 2; checkPrime <= n; checkPrime++){
            
            boolean match = true;
            
            for(int i = 2; i<checkPrime; i++){
                if(checkPrime % i == 0){
                    match = false;
                    break;
                }
            }
            if(match){
                System.out.print(checkPrime + " ");
            }
            
   } 
}
}
