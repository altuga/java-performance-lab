package jug.istanbul.okr.chapter02;

public class Code136 {

    public static void main(String[] args) {
        double zooTemperature = 1.21;
        System.out.println(zooTemperature); // 1.21
        zooTemperature = - zooTemperature;
        System.out.println(zooTemperature); // - 1.21
        zooTemperature = - (- zooTemperature);
        System.out.println(zooTemperature); // - 1.21

        // boolean peacock = 1; // DOES NOT COMPILE

        int parkAttendance = 0;
        System.out.println(parkAttendance); // 0
        System.out.println(++parkAttendance); // 1

        System.out.println(parkAttendance); // 1
        System.out.println(parkAttendance-- ); // 1
        System.out.println(parkAttendance); // 0

    }
}
