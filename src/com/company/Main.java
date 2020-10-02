package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Patient patient1 = new Patient("Adam",24,
                 new LeftEye("Left eye","healty","Blue"),
                 new RigthEye("Rigth eye", "nearsighted","Blue"),
                new Heart("Hearth","Healty",60),
                new Stomach("Stomach", "PUD"),
                 new Skin("Skin", "Burned"));

        int i = 0;
        Scanner scanner = new Scanner(System.in);

        while(i!=6){

            System.out.println(" i : " + i);

            System.out.println("Choose an organ:"+ "\n\t" + "1.Left Eye" + "\n\t" + "2.Right Eye" + "\n\t" + "3.Heart" + "\n\t" + "4.Stomach" + "\n\t" + "5.Skin" + "\n\t" + "6.Quit");
            i = scanner.nextInt();

            switch (i){
                case 1:
                    System.out.println(patient1.getLeftEye().getName());
                    System.out.println(patient1.getLeftEye().getMedicalCondition());
                    System.out.println(patient1.getLeftEye().getColor());
                    System.out.println("1.Close the Eye");
                    i = scanner.nextInt();
                    if(i ==1 ){
                        System.out.println("Eye is closed");

                    }break;

                case 2:
                    System.out.println(patient1.getRightEye().getName());
                    System.out.println(patient1.getRightEye().getMedicalCondition());
                    System.out.println(patient1.getRightEye().getColor());
                    System.out.println("1.Close the Eye");
                    i = scanner.nextInt();
                    if(i ==1 ){
                        System.out.println("Eye is closed");

                    }break;

                case 3:
                    System.out.println(patient1.getHeart().getName());
                    System.out.println(patient1.getHeart().getMedicalCondition());
                    System.out.println(patient1.getHeart().getHeartRate());
                    System.out.println("1.Change The Heart Rate");
                    i = scanner.nextInt();
                    if(i ==1 ){
                    System.out.println("Enter a new Heart Rate:");
                    int newheartRate = scanner.nextInt();
                    patient1.getHeart().setHeartRate(newheartRate);
                    System.out.println("Heart rate change to :");
                    System.out.println(patient1.getHeart().getHeartRate());
                    }break;

                case 4:
                    System.out.println(patient1.getStomach().getName());
                    System.out.println(patient1.getStomach().getMedicalCondition());
                    System.out.println("Need to be fed" + "\n\t" + "1.Digest");
                    i = scanner.nextInt();
                    if(i==1){
                        System.out.println("Digisting begin...");
                    }break;

                case 5:
                    System.out.println(patient1.getSkin().getName());
                    System.out.println(patient1.getSkin().getMedicalCondition());
                    break;

                case 6:
                    break;

            }


        }



    }
}
