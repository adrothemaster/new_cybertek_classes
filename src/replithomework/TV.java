package replithomework;

public class TV {
/*
Write a custom class TV that has 4 instance variables:
    int channel=1, int volumeLevel=0, boolean on = false, String brand = "undefined".
Create one no arguments constructor that prints message: "Creating TV object using no args-constructor".
Also, create one more constructor that defines instance variable brand, and displays message:"Creating TV object using 1 arg - constructor".
    Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.
    Declare methods channelUp() to increase variable channel by one, and channelDown() to decrease variable channel by one.
    Declare methods volumeUp() to increase variable volume by one, and volumeDown() to decrease variable volume by one.

     Create isOn(), turnOn() and turnOff() methods for on instance variable. If tv is already on, no need to turn it on again,
     display message: "TV is already ON". If tv is already off, then no need to turn it off again, display message: "TV is already OFF".
    Value of a variable channel cannot be negative or zero, and cannot be higher than 120. If user will try to set invalid channel,
    display message: "ERROR: TV is either OFF or invalid Channel".
    Volume can only be in the range between 0 and 7. You may change volume only if TV is on. Otherwise, display message:
    "ERROR: TV is either OFF or invalid Volume level". Use isOn() method that will check tv status.
     */

    int channel = 1;
    int volumeLevel = 0;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no args-constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel > 0 && volumeLevel < 7 && isOn()) {
            this.volumeLevel = volumeLevel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel > 0 && channel < 120 && isOn()) {
            this.channel = channel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    public void volumeUp() {
        volumeLevel++;
    }

    public void volumeDown() {
        volumeLevel--;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        if (on) {
            System.out.println("TV is already ON");
        } else {
            on = true;
        }
    }

    public void turnOff() {
        if (!on) {
            System.out.println("TV is already OFF");
        } else {
            on = false;
        }

    }

}

