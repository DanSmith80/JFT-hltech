package a_introduction;

public class Task9 {
    public static void main(String[] args) {

//        Create method that gets three numbers and returns the lowest of them

        double a = 1.40;
        double b = 2.40;
        double c = 3.50;

        double minNumber = minFrom(a, b, c);
        System.out.println("The lowest number is: " + minNumber);
    }

    public static double minFrom(double a, double b, double c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }


    }
}
