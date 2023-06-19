interface shape{
    void draw();
    int age();

}

class rectangle implements shape{
    public void draw(){
        System.out.println("A rectangle is drawn");
    }

    public int age(){
        return 10;
    }
}

class circle implements shape{
    public void draw(){
        System.out.println("A circle is drawn");
    }

    public int age(){
        return 10*2;
    }
}

class square implements shape{
    public void draw(){
        System.out.println("A square is drawn");
    }

    public int age(){
        return 30;
    }
}

public class interfaceTest {
 public static void main(String[] args){
    shape myShape = new rectangle();
    myShape.draw();

    System.out.println(myShape.age());
 }   
}
