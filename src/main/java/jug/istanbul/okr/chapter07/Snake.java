package jug.istanbul.okr.chapter07;

// Snake.java
public sealed class Snake permits Cobra {}
final class Cobra extends Snake {}