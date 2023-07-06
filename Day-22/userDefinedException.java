class MyNewException extends Exception {

    // Exception variables
    int age;
    String name;

    // Exception Constructor
    public MyNewException(int age, String name){
        this.name = name;
        this.age = age;
    }
}

public class userDefinedException  {
    
    public static void main(String[] args) {

        try {
            throw new MyNewException(21, "Yugendra");
        }

        catch (MyNewException me){
            System.out.println("MY NEW EXCEPTION WAS CORRECT");

            System.out.println(me.fillInStackTrace());
            System.out.println(me.getMessage());
            System.out.println(me.getCause());
        }

    }
}

