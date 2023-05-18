package h_objects;

public class Car {
    private int numberOfDoors;
    private double horsepower;

    public double getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(double horsepower) {
        if (horsepower<1 || horsepower > 1500) {
            System.out.println("Horsepower should be between 1 and 1500");
        } else {
            this.horsepower = horsepower;
        }
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors < 0 || numberOfDoors > 100) {
            // don't do anythin with private variable
            System.out.println("Cannot set door number to:" + numberOfDoors);
        } else {
            this.numberOfDoors = numberOfDoors;
        }
    }

    public Car() {
        numberOfDoors = 5;
        horsepower = 100;
    }

    public Car(int numberOfDoors, double horsepower) {
        this.numberOfDoors = numberOfDoors;
        this.horsepower = horsepower;
    }


    public String getDetails() {
        return "Our car has: " + numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car has: " + numberOfDoors + " doors";
    }
}

