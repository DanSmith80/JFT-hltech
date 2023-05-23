package a_introduction;

public class Task10 {
    public static void main(String[] args) {
        int a = 9;
        System.out.println(a); // prints 9
        String b = "test";
        for (int i = 0; i < 10; i++) {
            System.out.println(i); // this variable scope is available only inside loop
            System.out.println(b); // b was declared inside of the loop, so we can access it
            System.out.println(a); // b was declared outside of the loop, so we can access it
        }

        System.out.println(b); // now we also have an error
    }


}
