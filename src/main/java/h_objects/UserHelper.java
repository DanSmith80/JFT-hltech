package h_objects;

public class UserHelper {
    public static String getRandomUser() {
        long currentTimeMillis = System.currentTimeMillis();
        return "user+" + currentTimeMillis + "@gmail.com";
    }

}
