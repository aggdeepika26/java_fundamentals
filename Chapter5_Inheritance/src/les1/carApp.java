package les1;

public class carApp {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.honk();

        System.out.println("*********************************");
        Car myCar = new Car();
        myCar.honk();
        myCar.sound();

        System.out.println("**********************************");
        System.out.println("This vehicle is an " + myCar.getTypeOfVehicle() + "The brand is " + myCar.getBrandName());
    }
}
