abstract class shape{
    abstract void shapeName();
}

class circle extends shape{
    void shapeName(){
        System.out.println("We have drawn a circle ");
    }
}

class rectangle extends shape{
    void shapeName(){
        System.out.println("We have drawn a rectangle");
    }
} 

class square extends shape{
    void shapeName(){
        System.out.println("We have drawn a Square");
    }
} 
public class abstractionTest {
    
    public static void main(String[] args){
        
        shape student1 = new circle();
        shape student2 = new rectangle();
        shape student3 = new square();


        student1.shapeName();
        student2.shapeName();
        student3.shapeName();
    }
}
