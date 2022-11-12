package ua.lv.pylypiuk.anton.homework;

class NokiaPhone implements PhoneConnection {
    @Override
    public void call() {
        System.out.println("Calling...");
    }
    public void sendMassages() {
        System.out.println("Sending massages...");
    }
}
