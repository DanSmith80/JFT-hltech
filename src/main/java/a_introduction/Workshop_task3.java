package a_introduction;

public class Workshop_task3 {

    public static void main(String[] args) {

        String original = "Beer";
        String original2 = "Bank of England";

        String reversed = reverseString(original);
        System.out.println(reversed);

        String reversed2 = reverseString(original2);
        System.out.println(reversed2);
    }

    public static String reverseString(String original) {
        String reversed = "";
        for (int i = 0; i < original.length(); i++) {
            reversed = original.charAt(i) + reversed;
            System.out.println(reversed);
        }
        return reversed;


    }

}
