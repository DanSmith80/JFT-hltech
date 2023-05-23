package a_introduction;

public class ConditionalDemo {
    public static void main(String[] args) {
        boolean result1 = shouldIAnswer(false, false, true);
        System.out.println("I answer: " + result1);

        boolean result2 = shouldIAnswer(true, true, false);
        System.out.println("I answer: " + result2);
    }

    public static boolean shouldIAnswer(boolean isMorning, boolean isMomCalling, boolean isAsleep) {
        if (!isAsleep && isMomCalling || (!isAsleep && !isMomCalling && !isMorning)) {
            // System.out.println("I answer");
            return true;
        } else {
            return false;
            // System.out.println("I do not answer");
        }
    }
}
