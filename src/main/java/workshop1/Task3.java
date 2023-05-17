package workshop1;

public class Task3 {
    public static void main(String[] args) {
        String x = reverseString("Bank of England");
        System.out.println(x);
    }

    public static String reverseString(String original) {
        StringBuilder sb = new StringBuilder();
        sb.append(original);
        return sb.reverse().toString();
    }

//    public static String reverseString(String original) {
        // for loop tbd
//    }
}
