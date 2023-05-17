package c_exceptions;

public class ThrowExceptions {
    public static void main(String[] args) {
        int[] arr1 = { };
        int[] arr2 = { 1, 11, 3, 4, 9 };

        System.out.println(getMaxElement(arr1));
        System.out.println(getMaxElement(arr2));
    }

    private static int getMaxElement(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }
}
