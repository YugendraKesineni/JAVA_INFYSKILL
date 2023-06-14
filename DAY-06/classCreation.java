
public class classCreation{
    public static void main(String[] args){
        car myCar = new car(15,"Hyundai",800000,120);

        car myFriendCar = new car();
        System.out.println("My friend car mileage :" + myFriendCar.mileage);

        car myNewFriendCar = new car(15,"Maruthi");
        
        System.out.println("My new Friend car " + myNewFriendCar.mileage);
        
    } 
}

