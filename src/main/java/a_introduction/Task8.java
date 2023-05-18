package a_introduction;

import java.time.Year;

public class Task8 {

    public static void main(String[] args) {
        double priceAfterDiscount = calculatePrice(100, 0.10);
        // i expect 90.00 as a price after discount
        System.out.println(priceAfterDiscount);

        double priceWithWrongDiscount = calculatePrice(123, 1.0);
        // i expect 123 as a price after discount
        System.out.println(priceWithWrongDiscount);

        double priceWithNegativeDiscount = calculatePrice(123, -0.1);
        // i expect 123 as a price after discount
        System.out.println(priceWithNegativeDiscount);
    }

    public static double calculatePrice(int price, double discount) {
        if (discount<=0 || discount>=1) {
            return price;
        } else {
            return price - (price * discount);
        }
    }
}
