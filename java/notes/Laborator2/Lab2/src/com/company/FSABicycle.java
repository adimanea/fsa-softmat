package com.company;

public class FSABicycle implements Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}
