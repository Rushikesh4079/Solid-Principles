package com.example.fifthprinciple;


public class FifthPrinciple {
    public static void main(String[] args) {
        InputDevice keyboard = new Keyboard(); // depends on interface
        Computer computer = new Computer(keyboard);
        computer.receiveInput();
    }
}
