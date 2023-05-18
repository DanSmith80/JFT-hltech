package h_objects;

import java.util.List;

public class App {

    public static void main(String[] args) {
        double totalWorthOfArts = 0;

        Paint picasso = new Paint(10, 2);
        double picassoPrice = picasso.getPrice();

        IPriceable caravaggio = new Paint(3, 3);
        double caravaggioPrice = caravaggio.getPrice();

        IPriceable venus = new Sculpture(150);
        double venusPrice = venus.getPrice();



        List<IPriceable> arts = List.of(picasso, venus, caravaggio);
        for (IPriceable a : arts) {
            System.out.println(a.getPrice());
            totalWorthOfArts += a.getPrice();
        }

        System.out.println("Total money if i sold all arts: " + totalWorthOfArts);

    }
}
