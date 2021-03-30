package com.company;

public class Main {

    public static void main(String[] args) {
        // Bicycle interface used
        Bicycle bike3=new FSABicycle();
        bike3.changeCadence(10);
        bike3.speedUp(4);
        bike3.printStates();


        // Car interface used
        ICar car1=new Car();
        car1.setColor("Blue");
        car1.setDoors(2);
        car1.Drive();
    }
}
