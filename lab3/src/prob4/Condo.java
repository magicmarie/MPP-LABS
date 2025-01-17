package prob4;

public class Condo extends Property {
    private int numberOfFloors;

    public Condo(int noOfFloors) {
        super();
        this.numberOfFloors = noOfFloors;
    }

    @Override
    public double computeRent() {
        return 400 * numberOfFloors;
    }
}

