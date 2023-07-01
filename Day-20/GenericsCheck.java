class Check<V> {
    // Instance variables
    V myValue;

    // Constructor
    Check(V myValue){
        this.myValue = myValue;
    }

    // Methods

    //Getter Methods
    public V getMyValue (){
        return this.myValue;
    }
}

public class GenericsCheck {
    
    public static void main(String[] args) {

        Check<String> myString = new Check<String>("Infyskill");

        System.out.println("The value of your Object is  " + myString.getMyValue());

        Check<Double> myDouble = new Check<Double>(10.86);

        System.out.println("The value of your object is " + myDouble.getMyValue());

        Check<Integer> myInteger = new Check<Integer>(3);

        System.out.println("The value of your object is " + myInteger.getMyValue());
        
    }
}
