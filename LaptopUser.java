package com.laptop;

import java.util.Scanner;

public class LaptopUser {
    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    public void turnOnLaptop() {
        laptop.powerOn();
    }

    public void turnOffLaptop() {
        laptop.powerOff();
    }

    public void increaseVolume() {
        laptop.volumeUp();
    }

    public void decreaseVolume() {
        laptop.volumeDown();
    }
}