package workshop1;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] rn = returnTwentyRandomNumbers();
        for (int i : rn) {
            System.out.println(i);
        }
    }

    public static int[] returnTwentyRandomNumbers() {
        int[] randomNumbers = new int[20];
        Random r = new Random();

        for (int i=0; i<randomNumbers.length; i++) {
            randomNumbers[i] = r.nextInt(101);
        }
        return randomNumbers;
    }
}
