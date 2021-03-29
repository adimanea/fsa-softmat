package com.company;

public class Car {
    private int speed = 0;
    private String color;
    private int gear = 0;
    private int doors = 0;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Drive() {
        System.out.println("The " + color + " car has " + doors + " doors and the speed of " + speed + " Km/h in gear " + gear + ".");
    }
}
