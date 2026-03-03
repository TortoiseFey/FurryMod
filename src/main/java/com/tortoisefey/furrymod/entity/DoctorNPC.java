package com.tortoisefey.furrymod.entity;

public class DoctorNPC {
    private String name;
    private String specialty;

    public DoctorNPC(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void treatPatient() {
        System.out.println(name + " is treating a patient in the " + specialty + " department.");
    }
}