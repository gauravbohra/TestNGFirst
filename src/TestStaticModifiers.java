
public class TestStaticModifiers {

	public static void main(String[] args) {
        Car Toyota = new Car();
        Toyota.sModel="Camry";
        Toyota.iHighestSpeed = 230;
       

        System.out.println("Model of the Car: " + Toyota.sModel);
        System.out.println("Max speed of the Car: " + Toyota.iHighestSpeed);
        System.out.println("Number of Wheels in the Car: " + Toyota.iWheels); //Compile Time Error
        System.out.println("Number of Wheels in the Car: " + Car.iWheels);
        System.out.println("Number of Steering in the Car: " + Toyota.iSteering);
         }
    }