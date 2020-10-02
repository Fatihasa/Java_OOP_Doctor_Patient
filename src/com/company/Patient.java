package com.company;

public class Patient {

    private String name;
    private int age;
    private Eye leftEye;
    private Eye rightEye;
    private Heart heart;
    private Organ stomach;
    private Organ skin;


    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Organ stomach, Organ skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public Patient(String name, int age) {
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

    public Eye getLeftEye() {
        return leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public Heart getHeart() {
        return heart;
    }


    public Organ getStomach() {
        return stomach;
    }

    public Organ getSkin() {
        return skin;
    }
}
