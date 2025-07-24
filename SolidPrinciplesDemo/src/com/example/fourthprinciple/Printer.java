package com.example.fourthprinciple;

public class Printer implements Printable {
    @Override
    public void print() {
        System.out.println("Printing document ");
    }
}
