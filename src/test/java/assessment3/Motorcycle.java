package assessment3;

class Motorcycle extends Vehicle {
    boolean hasSideCars = false;

    public Motorcycle(int yearParam) throws InvalidYearException {
        super(yearParam);
    }

    //overloading constructor
    public Motorcycle(int yearParam, boolean sideCar) throws InvalidYearException {
        super(yearParam);
        hasSideCars = sideCar;
    }

    @Override
    public void vehicleSound() {
        System.out.println("bip bip, the motorcycle type is: " + hasSideCars);
    }
}