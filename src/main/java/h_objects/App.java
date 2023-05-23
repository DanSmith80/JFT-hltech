package h_objects;

import java.util.List;

public class App {

    public static void main(String[] args) {
        double totalWorthOfArts = 0;

        Paint picasso = new Paint(10, 2);
        double picassoPrice = picasso.getPrice();

        IPriceable caravaggio = new Paint(3, 3);
        double caravaggioPrice = caravaggio.getPrice();

        System.out.println("Number of paints: " + Paint.paintCounter);

        IPriceable venus = new Sculpture(150);
        double venusPrice = venus.getPrice();



        List<IPriceable> arts = List.of(picasso, venus, caravaggio);
        for (IPriceable a : arts) {
            System.out.println(a.getPrice());
            totalWorthOfArts += a.getPrice();
        }

        System.out.println("Total money if i sold all arts: " + totalWorthOfArts);

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
