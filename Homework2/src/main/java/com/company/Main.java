package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Driver ourDriver = new Driver("Олег", 45, 15);
        Engine ourEngine = new Engine(154, "Ford");
        Car ourCar = new Car("Ford", "S class", 5,ourDriver,ourEngine);

        System.out.println(ourDriver);

        System.out.println(ourEngine);

        System.out.println(ourCar);
    }
}

