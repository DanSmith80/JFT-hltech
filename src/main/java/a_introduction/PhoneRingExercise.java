package a_introduction;

public class PhoneRingExercise {

    public static void main(String[] args) {

        boolean isMorning = false;
        boolean isMomCalling = true;
        boolean isAsleep = false;

        if (isAsleep){
            System.out.println("I'm alseep");
        }
        else if (isMorning && isMomCalling || !isMorning){
            System.out.println("I'm answering");
        }
        else if (isMorning) {
            System.out.println("I'm not answering");
        }

//        answer (below) is I'm not asleep&it's mum or not asleep&not mum&not morning then answer, else do not answer
//        if (!isAsleep && isMomCalling || (!isAsleep && !isMomCalling && !isMorning)) {
//            System.out.println("I answer");
//        } else {
//            System.out.println("I do not answer");

    }



}
