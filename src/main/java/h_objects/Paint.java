package h_objects;

public class Paint extends Rectangle implements IPriceable {
    public static int paintCounter;

    public Paint(int height, int width) {
        paintCounter++;
        this.height = height;
        this.width = width;
    }

    public double getPrice() {
        return getArea() * 400.0;
    }
}
