package com.company.professions;

import com.company.entities.Person;

public class Driver extends Person {
    private int drivingStage;
    private String name;
    private int age;

    public Driver(String name, int age, int drivingStage) {
        super(name, age);
        this.drivingStage = drivingStage;
        this.name = name;
        this.age = age;

    }

    public void setDrivingStage(int drivingStage) {
        this.drivingStage = drivingStage;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "drivingStage=" + drivingStage +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getDrivingStage() {
        return drivingStage;
    }
}

