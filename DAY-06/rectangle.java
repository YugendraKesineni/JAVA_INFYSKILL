public class rectangle {
    
    // Fields
    int length;
    int breadth;

    // Constructors
    rectangle(){
        System.out.println("Default Constructor");
    }

    rectangle(int length){
        this.length = length;
        System.out.println("Constructor with length is called");
    }
    rectangle(int length,int breadth){
        this.breadth = breadth;
        this.length = length;
        System.out.println("Construction with breadth is called");
    }

    int area(){
        return this.length * this.breadth;
    }

}
