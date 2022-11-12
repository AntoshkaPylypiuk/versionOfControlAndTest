package com.company.details;

public class Engine {

    private int capacity;
    private String manufacturer;

    public Engine(int capacity, String manufacturer) {
        this.capacity = capacity;
        this.manufacturer = manufacturer;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity='" + capacity + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
