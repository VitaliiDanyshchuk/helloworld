package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class harryPotter {
    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get(
                "C:\\Users\\Vitaliy\\Desktop\\harry.txt")));
        String clearText = text
                .replaceAll("\\?", "")
                .replaceAll(",", "")
                .replaceAll("\\!", "")
                .replaceAll("\\.", "")
                .replaceAll("\"", "")
                .replaceAll("-", "")
                .replaceAll(":", "")
                .replaceAll("-", "")
                .replaceAll(";", "")
                .replaceAll("\n", "")
                .replaceAll("\\)", "");


//get array of words
        String[] words = clearText.split(" ");

        String distinctWords = " ";
        for ( int i = 0; i <words.length ; i++) {
            if(!distinctWords.contains(words[i]))
                distinctWords += words[i]+ " ";
        }
        String[] distinctArray = distinctWords.split(" ");

            Arrays.sort(distinctArray);
            for( int i = 0; i < distinctArray.length; i++) {
                System.out.println(distinctArray[i]);
            }


        }

    }

