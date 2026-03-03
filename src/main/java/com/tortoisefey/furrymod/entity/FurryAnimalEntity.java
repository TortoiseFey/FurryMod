package com.tortoisefey.furrymod.entity;

public class FurryAnimalEntity {
    // Define attributes and methods for FurryAnimalEntity
    private String name;
    private int age;

    public FurryAnimalEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}