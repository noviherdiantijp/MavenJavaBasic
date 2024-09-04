package assessment3;

public class Main {

    public static void main(String[] args) throws InvalidYearException {
        Vehicle vehicle = new Vehicle(2018);
        vehicle.vehicleSound();

        Vehicle vehicle2 = new Vehicle(2021, "Mitsubisi", "outlander");
        vehicle2.vehicleSound();

        Vehicle motorcycle = new Motorcycle(2015);
        motorcycle.vehicleSound();

        Vehicle motorcycle2 = new Motorcycle(2019, true);
        motorcycle2.vehicleSound();

        Vehicle car2 = new Car(2023, 1);
        car2.vehicleSound();

        Vehicle car3 = new Car(2023);
        car3.vehicleSound();

        //exception for invalid year
        boolean exceptionThrown = false;
        try {
            Vehicle car = new Car(2000);
            car.vehicleSound();
        } catch (InvalidYearException e) {
            exceptionThrown = true;
            System.out.println("Caught invalid year exception: " + e.getMessage());
        } finally {
            String message = "successfully";
            if (exceptionThrown)
                message = "failed to be";

            System.out.println("Car object is " + message + " created");
        }
    }
}
