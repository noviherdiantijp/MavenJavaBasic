package assessment3;

import java.time.Year;

class Vehicle {
    String brandName = "Range Rover";
    String model = "Range Rover Sport SE";

    int year;

    public Vehicle(int yearParam) throws InvalidYearException {
        year = yearParam;
        yearCalculation();
    }

    //overloading constructor
    public Vehicle(int yearParam, String brand, String modelType) throws InvalidYearException {
        year = yearParam;
        brandName = brand;
        model = modelType;
        yearCalculation();
    }

    public void yearCalculation() throws InvalidYearException {
        int currYear = Year.now().getValue();

        if (year > currYear) {
            throw new InvalidYearException("Year: " + year + " Failed : is invalid > current year (" + currYear + ")");
        }
    }

    public void vehicleSound() {
        System.out.println("tin tin, the vehicle's brand is " + brandName + " with model: " + model);
    }
}