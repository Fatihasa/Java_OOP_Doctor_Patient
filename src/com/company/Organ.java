package com.company;

public abstract class Organ  {

    private String name;
    private String MedicalCondition;





    public Organ(String name, String medicalCondition) {

        this.name = name;
        MedicalCondition = medicalCondition;

    }

    public String getName() {
        return name;
    }

    public String getMedicalCondition() {
        return MedicalCondition;
    }




}
