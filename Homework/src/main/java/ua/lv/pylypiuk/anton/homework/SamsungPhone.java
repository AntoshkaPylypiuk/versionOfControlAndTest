package ua.lv.pylypiuk.anton.homework;

class SamsungPhone implements PhoneConnection, PhoneMedia {
    @Override
    public void call() {
        System.out.println("Calling...");
    }
    public void sendMassages() {
        System.out.println("Sending massages...");
    }
    public void takePicture() {
        System.out.println("Taking picture...");
    }
    public void makeVideo() {
        System.out.println("Making video...");
    }
}