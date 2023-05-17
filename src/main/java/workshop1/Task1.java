package workshop1;

public class Task1 {

    public static void main(String[] args) {
        String[] intArray = {"12", "22", "32", "41"};
        String[] doubleArray = {"12.2", "22.1", "32.2", "41.2"};
        // create two new arrays with integers and doubles instead of strings
        // hint: Integer.parseInt() - https://www.tutorialspoint.com/java/number_parseint.htm
        // hint: Double.parseDouble()

        int[] justInts = new int[intArray.length];
        double[] justDoubles = new double[doubleArray.length];

        for (int i=0; i< intArray.length; i++) {
            justInts[i] = Integer.parseInt(intArray[i]);
        }

        for (int i=0; i< intArray.length; i++) {
            justDoubles[i] = Double.parseDouble(doubleArray[i]);
        }

        for (int i: justInts) {
            System.out.println(i);
        }

        for (double d: justDoubles) {
            System.out.println(d);
        }
    }
}
