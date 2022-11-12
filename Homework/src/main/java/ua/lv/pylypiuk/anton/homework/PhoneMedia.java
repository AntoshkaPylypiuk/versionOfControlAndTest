package ua.lv.pylypiuk.anton.homework;

public interface PhoneMedia {

    default void takePicture() {
        System.out.println("TakingPicture...");
    }
    default void makeVideo() {
        System.out.println("MakingVideo");
    }
}
