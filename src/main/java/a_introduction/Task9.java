package a_introduction;

public class Task9 {
    public static void main(String[] args) {
        double result1 = minFrom(1,2,3);
        // i expect 1
        System.out.println(result1);

        double result2 = minFrom(3,1,100);
        // i expect 1
        System.out.println(result2);

        double result3 = minFrom(1,3,3);
        // i expect 1
        System.out.println(result3);
    }

    public static double minFrom(double a, double b, double c) {
        int z = 1000;
        if (a<b && a<c) {
            return a;
        } else if (b<a && b<c) {
            return b;
        } else {
            return c;
        }
    }
}
