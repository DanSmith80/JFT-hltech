package a_introduction;

public class TreeWithNumbers {
    public static void main(String[] args) {
        for (int row=0; row<5; row++) {
            for (int column=0; column<5; column++) {
                if (column<=row) {
                    System.out.print("* ");
                } else {
                    System.out.print(column + " ");
                }
            }
            System.out.println();
        }
    }
}
