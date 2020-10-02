package com.company;

public abstract class Eye extends Organ {

    private String color;

    public Eye(String name, String medicalCondition, String color) {
        super(name, medicalCondition);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
