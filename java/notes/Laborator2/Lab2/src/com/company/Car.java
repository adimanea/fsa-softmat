package com.company;

public class Car implements ICar {
    private int speed = 0;
    private String color;
    private int gear = 0;
    private int doors = 0;

    @Override
    public int getDoors() {
        return doors;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public int getGear() {
        return gear;
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void Drive() {
        System.out.println("The " + color + " car has " + doors + " doors and the speed of " + speed + " Km/h in gear " + gear + ".");
    }
}
