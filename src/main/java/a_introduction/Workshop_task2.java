package a_introduction;

public class Workshop_task2 {

    public static void main(String[] args) {

        // for points 0-50 its F
        // 51 - 60 its E
        // 61 - 70 its D
        // 71 - 80 its C
        // 81 - 90 its B
        // 91 - 100 its A
        // less than 0 or more than 100 - 'X'

        char grade = getGrade(101);
        System.out.println("Grade is: " + grade);

    }

    public static char getGrade(int points) {
        if (points > 0 && points <= 50) {
            return 'F';
        }
        else if (points > 50 && points <= 60) {
            return 'E';
        }
        else if (points > 60 && points <= 70) {
            return 'D';
        }
        else if (points > 70 && points <= 80) {
            return 'C';
        }
        else if (points > 80 && points <= 90) {
            return 'B';
        }
        else if (points > 90 && points <= 100) {
            return 'A';
        }
        else {return 'X';}


    }

}
