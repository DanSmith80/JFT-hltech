package a_introduction;

import java.text.DecimalFormat;

public class Task1 {
    public static void main(String[] args) {

        double variableToFormat = 2.125125215;
        String result = String.format( "%.2f", variableToFormat );
        System.out.println(result);


    }
}
