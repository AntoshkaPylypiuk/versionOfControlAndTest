package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carBrand;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String carBrand, String carClass, int weight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public int getWeight() {
        return weight;
    }


    void start() {

    }

    {
        System.out.println("Поїхали");
    }

    void stop() {

    }

    {
        System.out.println("Зупиняємося");
    }

    void turnRight() {

    }

    {
        System.out.println("Поворот направо");
    }

    void turnLeft() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    {
        System.out.println("Поворот наліво");
    }
}


