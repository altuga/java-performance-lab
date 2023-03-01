package jug.istanbul.okr.chapter07;

public interface ZooRenovation {
    public String projectName();

    abstract String status();

    default void printStatus() {
        System.out.print("The " + projectName() + " project " + status());
    }


}

class Test implements ZooRenovation {

    @Override
    public String projectName() {
        return  " Hello";
    }

    @Override
    public String status() {
        // TODO Auto-generated method stub
        return "Go";
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.printStatus();
    }

}