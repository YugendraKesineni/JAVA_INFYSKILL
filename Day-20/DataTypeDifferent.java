class check<V, W> {

    // Instance variables
    V FirstValue;
    W SecondValue;

    // Constructors 
    check(V FirstValue, W SecondValue){
        this.FirstValue = FirstValue;
        this.SecondValue = SecondValue;
    }

    // Method 
    public void printOurValues(){
        System.out.println("Your First Value is " + FirstValue);
        System.out.println("Your Second Value is " + SecondValue);
    }
}

public class DataTypeDifferent {
    public static void main(String[] args) {

        check<Integer, Double> myFirstCheck  = new check<Integer, Double>(2,3.5);

        myFirstCheck.printOurValues();

        check<Double, String> mySecondCheck = new check<Double, String>(3.1,"Hello");

        mySecondCheck.printOurValues();
        
    } 
}
