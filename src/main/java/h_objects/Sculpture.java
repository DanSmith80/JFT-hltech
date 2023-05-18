package h_objects;

public class Sculpture implements IPriceable {
    public double mass;

    public Sculpture(double mass) {
        this.mass = mass;
    }

    public double getPrice() {
        return mass * 1000;
    }

}
