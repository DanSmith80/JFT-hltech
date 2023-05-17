package workshop1;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(getGrade(100));
    }

    public static char getGrade(int points) {
        if (points>=0 && points<=50) {
            return 'F';
        } else if (points>=51 && points <=60) {
            return 'E';
        } else if (points>=61 && points <=70) {
            return 'D';
        } else if (points>=71 && points <=80) {
            return 'C';
        } else if (points>=81 && points <=90) {
            return 'B';
        } else if (points>=91 && points <=100) {
            return 'A';
        } else {
            return 'X';
        }
    }
}
