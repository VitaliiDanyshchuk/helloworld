/*
 * First Lab About myself
 *
 * Version info 1
 *
 * Copyright Vitalii Danyshchuk

 */

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

        }
    }

