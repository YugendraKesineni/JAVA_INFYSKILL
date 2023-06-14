class car {

    // Fields or variables of a class
    int mileage;
    String model;
    int price;
    int top_speed;

    // COnstructors

    car(){
        System.out.println("Default constructor is called");
    }
    car(int mileage, String model){

        
        this.mileage = mileage;
        this.model = model;  
        System.out.println("New Constructor with 2 parameters called");
    }

    car(int mileage,String model,int price, int top_speed){

        // Assigning values of parameters to fields of the class using this keyword

        this.mileage = mileage;
        this.model = model;
        this.price = price;
        this.top_speed = top_speed;
        System.out.println("New Constructor with 4 parameters called");
    }
    
}

