package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    public String carryingCapacityOfTheBody;

    public Lorry(String carBrand, String carClass, int weight, String carryingCapacityOfTheBody, Driver driver, Engine engine) {
        super(carBrand, carClass, weight, driver, engine);
        this.carryingCapacityOfTheBody = carryingCapacityOfTheBody;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carryingCapacityOfTheBody='" + carryingCapacityOfTheBody + '\'' +
                '}';
    }
}
