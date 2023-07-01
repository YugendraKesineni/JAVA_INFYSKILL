public class multiCatch {
    public static void main(String[] args){

        int myarr[] = new int[4];

        myarr[0] = 15;
        myarr[1] = 1;
        myarr[2] = 0;
        myarr[3] = 3;
            for(int i = 1; i < myarr.length + 1000000; i++){
                try{
                    System.out.println("The value is " + myarr[0] / myarr[i]);
                }
                catch (ArithmeticException e) {
                    System.out.println("/ by zero  is performed please check");
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("You are iteration more than the array length");
                    break;
                }
            }
        }
        
}
