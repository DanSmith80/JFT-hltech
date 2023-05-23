package a_introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectedLoops1 {


//Print this:
//* 2 3 4 5
//* * 3 4 5
//* * * 4 5
//* * * * 5
//* * * * *

    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                if (column <= row) {
                    System.out.print("*");
                } else {
                    System.out.print(column);
                }
            }
            System.out.println();
        }
    }


}


