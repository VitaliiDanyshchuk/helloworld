package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Harry {
    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get(
                "C:\\Users\\Vitaliy\\Desktop\\harry.txt")));
        String longestWord = "";
        String clearText = text
                .replaceAll("\\?","")
                .replaceAll(",","")
                .replaceAll("\\!","")
                .replaceAll("\\.","")
                .replaceAll("\"","")
                .replaceAll("-","")
                .replaceAll("\n","");

        String [] words = clearText.split(" ");


        for (int i = 0; i < words.length ; i++) {
            if(words[i].length() >= longestWord.length()){
                longestWord = words[i];
            }
        }
        System.out.println("The longest word is: '" + longestWord + "' " +
                "with the " + longestWord.length() + " numbers in word ");

        int harryWords=0;
        for (int i = 0; i < words.length ; i++){
            if(words[i].contains("Harry"))
                harryWords++;
        }
        System.out.println("Word Harry" +" repeats "+harryWords+" times");

        System.out.println(" hashCode: ");
        for (int i = 0; i < words.length ; i++) {
            System.out.println(words[i].hashCode());

        }

        for (int i = 0; i < words.length; i++) {

        int    count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }

            if (count > 1 && words[i] != "0")
                System.out.println("The word: "+ words[i]+ " repeats "+count+
                        " times ");
        }
        }
    }
