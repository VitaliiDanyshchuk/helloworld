package com.company;

public class Main {

    public static void main(String[] args) {

        byte age = 21;
        short height = 170;
        int currentSalary = 12000;
        long minutesLived = 2147483648L;
        float weight = 75.7f;
        double metersPassed = 13324.31234;
        boolean isMarried = false;
        char signature = '@';
        String about = "Hi everyone. I`m from Chernivci national university." +
                "\n"+ "My age is: " + age +"\n" + "My height is: " +
                height + " cm \n" + "My Current salary is: " + currentSalary +
                " grivnas \n" + "I lived" + " for: " + minutesLived +
                " minutes\n" +"My weight is: " + weight + " kg \n" +
                "I passed: " + metersPassed  + "meters \n" + "I`m married?: " +
                isMarried + "\n" + "My signature: " + signature + "\nGood " +
                "luck!";
//256
        System.out.println(about);
        System.out.println("String length is: " + about.length());

        // System.out.println("My age is: " + age);
        //System.out.println("My height is: " + height + " cm");
        //System.out.println("My Current salary is: " + currentSalary + " grivnas");
        //System.out.println("I lived for: " + minutesLived + " minutes");
        //System.out.println("My weight is: " + weight + " kg");
        //System.out.println("I passed: " + metersPassed + " meters");
        //System.out.println("I`m married?: " + isMarried );
        //System.out.println("My signature: " + signature);
        }
    }

