package com.example.hospitalday1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patients")
public class PatientModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String doctor;

    public PatientModel() {
    }

    public PatientModel(int id, String name, int age, String doctor) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
