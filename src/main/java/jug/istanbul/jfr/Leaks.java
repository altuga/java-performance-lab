package jug.istanbul.jfr;

import java.util.HashMap;
import java.util.Map;

public class Leaks {

    private static final Map<Object, Object> SESSION_DATA = new HashMap<>();

    public static class UserInformation {
        private byte[] data = new byte[10000];
    }

    public static void main(String[] args) {
        String userId = "user";
        while (true) {
            UserInformation user = (UserInformation) SESSION_DATA.get(userId);
            if (user == null) {
                user = findUserInformation(userId);
                // SESSION_DATA.put(userId, user); // Correct
                SESSION_DATA.put(user, user);      // Wrong
            }
            sleep();
        }
    }

    private static UserInformation findUserInformation(String userId) {
        sleep();
        return new UserInformation();
    }

    private static void sleep() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {}
    }
}