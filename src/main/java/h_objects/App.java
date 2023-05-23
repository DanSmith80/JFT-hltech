package h_objects;

public class App {
    public static void main(String[] args) {

//        Create a Paint object
//        Set its height and width
//        Display its price

        Paint paint = new Paint(10,5);
        System.out.println("Price of paint  is: Euro" +paint.getPrice());

        Paint paint1 = new Paint(11,6);
        System.out.println("Price of paint1 is: Euro" +paint1.getPrice());

        Paint paint2 = new Paint();
        System.out.println("Price of paint2 (constructor) is Euro" +paint2.getPrice());

        IPriceable paint3 = new Paint(3,5);
        System.out.println(paint3);

    }
}
