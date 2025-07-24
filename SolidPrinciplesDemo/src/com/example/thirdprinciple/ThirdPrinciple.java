package com.example.thirdprinciple;

public class ThirdPrinciple {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        Transporter transporter = new Transporter();
        transporter.transport(car);  
        transporter.transport(bike); 
    }
}
