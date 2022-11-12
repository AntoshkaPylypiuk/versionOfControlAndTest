package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    public String speedLimit;

    public SportCar(String carBrand, String carClass, int weight, String speedLimit, Driver driver, Engine engine) {
        super(carBrand, carClass, weight, driver, engine);
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speedLimit='" + speedLimit + '\'' +
                '}';
    }
}
