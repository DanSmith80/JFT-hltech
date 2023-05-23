package a_introduction;

public class CharLetters {

    public static void main(String[] args) {
        String name = "Michal";
        char[] nameLetters = name.toCharArray();

        for (char c : nameLetters) {
            System.out.println(c);
        }

//        String name = "Michal";
//        char[] nameLetters = name.toCharArray();
//
//        for (int i = nameLetters.length-1; i>= 0; i--) {
//            System.out.println(nameLetters[i]);
//        }
//    }
    }
}
