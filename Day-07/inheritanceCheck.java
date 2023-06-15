class Employee{

    // Instance Variables or Fields
    int age;
    String name;
    int Joining_year;
    float salary;

    // Constructor
    Employee(){
        System.out.println("This is a default Constructor");
    }
    Employee(int age, String name, int Joining_year, float salary){
        this.age = age;
        this.name = name;
        this.Joining_year = Joining_year;
        this.salary = salary;

        System.out.println("Employee is Created");
    }

    
    // Methods
    // Method Overriding
    float bonus(){
        return this.salary + 10000;
    }

    // Method Overloading
    void info(String name, int Joining_year){
        System.out.println("Name of the Employee : " + name);
        System.out.println("Joined in : " + Joining_year);
    }

    void information(String name, int age){
        System.out.println("Employee age is " + age);
        System.out.println("Employee name is " + name);
    }
}

class Manager extends Employee{
    int promotion_year;

    // Constructors
    Manager(String name, int age, float salary, int promotion_year, int Joining_year){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.promotion_year = promotion_year;
        this.Joining_year = Joining_year;
    }

    // Bonus method is not written in Manager class
    // Method overriding
    float bonus(){
        return this.salary + 20000;
    }

    // Method Overloading
    void info(String name, float salary){
        System.out.println("Manager name is : " + name);
        System.out.println("Manager salary : " + salary);
    }

    void information(String name, int age){
        System.out.println("Manager age is " + age);
        System.out.println("Manager name is " + name);
    }
}

public class inheritanceCheck{
    public static void main(String[] args){

        Employee yugi = new Employee(23, "Yugendra", 2023, 25000);

        Manager iyengar = new Manager("Sudarshan", 43, 55000, 2020, 2000);

        yugi.information("Yugendra", 23);
        iyengar.information("Iyengar", 50);

    }
}







