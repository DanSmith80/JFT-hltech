package a_introduction;

import java.time.Year;

public class Task8 {

    public static void main(String[] args) {

//        Create method that takes price before discount, discount -> and returns price after discount.

        int price = 100;
        double discount = 0.25;

        double priceAfterDiscount = calculatePrice(price, discount);
        System.out.println("Price after discount is: £" + priceAfterDiscount);

    }

    public static double calculatePrice(int price, double discount) {
        return price - (price * discount);
    }

//      answer
//    public static double calculatePrice(int price, double discount) {
//        if (discount<=0 || discount>=1) {
//            return price;
//        } else {
//            return price - (price * discount);
//        }
//    }

}
