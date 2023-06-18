abstract class bike{

    abstract void run();
}
public class mybike extends bike{
    
    void run(){
        System.out.println("My bike is running");
    }
    public static void main(String[] args){

        mybike shine = new mybike();

        shine.run();
    }
}


