

public class exceptionCheck {
    static void printException() throws ArrayIndexOutOfBoundsException, ArithmeticException{
        try {

            try {

                try {
                    System.out.println("Internal try ");
                }
                catch (Exception a10){
                    System.out.println("This cant be printed");
                }
            throw new StringIndexOutOfBoundsException();

            }

            finally {
                System.out.println("Nested Exception");
            }

            
        }
        
        


        catch (ArrayIndexOutOfBoundsException ae) {
            throw new ArithmeticException();
        }

        catch (StringIndexOutOfBoundsException st){
            System.out.println("String Index exception found");
            System.out.println(st.fillInStackTrace());
        }
        catch (ArithmeticException a1){
            System.out.println("Arithmetics exception is thrown");
        }
    }
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{

        printException();
    }
}
