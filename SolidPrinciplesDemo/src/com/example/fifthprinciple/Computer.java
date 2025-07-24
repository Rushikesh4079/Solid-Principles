package com.example.fifthprinciple;

public class Computer {
    private InputDevice device;

    // Constructor injection (depending on abstraction)
    public Computer(InputDevice device) {
        this.device = device;
    }

    public void receiveInput() {
        device.input();
    }
}
