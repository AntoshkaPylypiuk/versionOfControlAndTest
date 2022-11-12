package ua.lv.pylypiuk.anton.homework;

public interface PhoneConnection {

    default void call() {
        System.out.println("Calling");
    }
    default void sendMassages() {
        System.out.println("SendingMassages");
    }
}
