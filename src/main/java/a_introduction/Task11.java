package a_introduction;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println("i=" + i + " j=" + j);
//            }
//        }

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.println("i=" + i + " j=" + j);
            }
        }
        Random r = new Random();

        int a = r.nextInt(11);

    }


}
