package com.laptop;
   
    public class Toshiba implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public Toshiba() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Toshiba menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Toshiba mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            volume += 10;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Toshiba dalam keadaan mati.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            volume -= 10;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Toshiba dalam keadaan mati.");
        }
    }
}
