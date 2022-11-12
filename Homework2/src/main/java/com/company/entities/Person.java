package com.company.entities;

public class Person {
           private String name;
           private int age;
           private String gender;
           private int telephoneNumber;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        if(name.isEmpty()) {
            System.out.println("Поле з ім'ям повинне бути заповнене");
        } else
            this.name = name;
    }

    public void setAge(int age) {
        if(age<0) {
            System.out.println("Вік повинен бути додатнім");
        } else
            this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                '}';
    }
}


