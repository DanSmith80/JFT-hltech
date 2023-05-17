package workshop1;

public class Task4 {
    public static void main(String[] args) {
        String x = "Abracadabra";
        char f = 'a';

        System.out.println(countTokens(x, f));
    }

    public static int countTokens(String str, char x) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c==x) {
                count++;
            }
        }
        return count;
    }
}
