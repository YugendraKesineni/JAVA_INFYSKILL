import java.util.*;

class Employee{

    //Instance variables
    int employee_id;
    String pan_id;
    String name;

    // Constructors
    public Employee(int employee_id, String pan_id, String name){

        this.employee_id = employee_id;
        this.pan_id = pan_id;
        this.name = name;
    }

}
public class ClassList {
    
    public static void main(String[] args){

    LinkedList<Employee> mEmployees = new LinkedList<Employee>();

    Employee jaswant = new Employee(1, "abc123","jaswant");
    Employee anuhya = new Employee(2,"abc124","anuhya");
    Employee Geetha = new Employee(3,"Abc234", "Geetha");

    mEmployees.add(jaswant);
    mEmployees.add(0, Geetha);
    mEmployees.add(anuhya);

    for(Employee myEmployee : mEmployees){
        System.out.println(myEmployee.employee_id + " " + myEmployee.name + " " + myEmployee.pan_id);
    }
    }
}
