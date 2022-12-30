package jug.istanbul.okr.chapter01;

public class Mouse {
 final static int MAX_LENGTH = 5;
 int length;
 public void grow(int inches) {
   if (length < MAX_LENGTH) {
     int newSize = length + inches;
     length = newSize;
    }
  }

  public static void main(String args[]) {
    Mouse mouse = new Mouse();
    mouse.grow(10);
  }
}