package assessment3;

class Car extends Vehicle {
    int numOfDoors = 4;

    public Car(int yearParam) throws InvalidYearException {
        super(yearParam);
    }

    //overloading constructor
    public Car(int yearParam, int door) throws InvalidYearException {
        super(yearParam);
        numOfDoors = door;
    }

    @Override
    public void vehicleSound() {
        System.out.println("trin trin, the car has " + numOfDoors + " doors");
    }
}
