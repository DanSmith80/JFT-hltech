package h_objects;

public class Paint extends Rectangle implements IPriceable {

    //    Create a Paint class constructor that requires height and width
//            Correct the previous task
    public Paint(int w, int h) {
       height = h;
       width = w;
    }

    public Paint() {
        height = 3;
        width = 4;

    }

//    Create a getPrice() method in it that returns the price (area * EURO 400/m2)


    public int getPrice() {
        int price = getArea() * 400;
        return price;
    }
}
