package com.company;

public class array {
    public static void main (String[] args) {

    String[] words = new String[10];

        words[0]="Show";
        words[1]="must";
        words[2]="go";
        words[3]="on";
        words[4]="hello";
        words[5]="world";
        words[6]="not";
        words[7]="today";
        words[8]="lemon";
        for (int i = 0; i <words.length ; i++) {
        if (words[i].contains("o") && words[i].length()>4)
        {
        System.out.println("this word: " + words[i]);
        }
        }

}}
