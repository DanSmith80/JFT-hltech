package a_introduction;

public class TreeWithoutNumbers {
    public static void main(String[] args) {
        for (int row=0; row < 5; row++) {
            for (int column=0; column < row+1; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
