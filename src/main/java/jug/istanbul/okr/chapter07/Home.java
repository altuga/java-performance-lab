package jug.istanbul.okr.chapter07;

public class Home {
    private String greeting = "Hi"; // Outer class instance variable

    protected class Room { // Inner class declaration
        public int repeat = 3;

        public void enter() {
            for (int i = 0; i < repeat; i++) greet(greeting);
        }

        private static void greet(String message) {
            System.out.println(message);
        }
    }

    public void enterRoom() { // Instance method in outer class
        var room = new Room(); // Create the inner class instance
        room.enter();
    }
}

class Test3 {
    public static void main(String[] args) {
        var home = new Home();
        Home.Room room = home.new Room();
        room.enter();
    }
}
