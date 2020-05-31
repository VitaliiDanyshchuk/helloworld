/*
 * Laboratory work № 1. Strings, arrays, methods.
 *
 * Version info 1
 *
 * Copyright Vitalii Danyshchuk

 */
package com.company;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Harry {
    public static void main(String[] args) throws IOException {
// get a harry.txt into string
        String text = new String(Files.readAllBytes(Paths.get(
                "C:\\Users\\Vitaliy\\Desktop\\harry.txt")));
        String longestWord = "";
// clear the text of punctuation
        Integer[] hash = new Integer[text.length()];
        String clearText = text
                .replaceAll("\\?", "")
                .replaceAll(",", "")
                .replaceAll("\\!", "")
                .replaceAll("\\.", "")
                .replaceAll("\"", "")
                .replaceAll("-", "")
                .replaceAll("\n", "");


//get array of words
        String[] words = clearText.split(" ");
// get array of lines
        String[] lines = text.split("\n");

// search the longest word
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("The longest word is: '" + longestWord + "' " +
                "with the " + longestWord.length() + " numbers in word ");

// serch count the LINES where the word "Harry" is met.
        int harryLines = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("Harry"))
                harryLines++;
        }

        System.out.println("Lines with word \'Harry\'" + " repeats " + harryLines + " times");
// create  hash array
        for (int i = 0; i < words.length; i++) {
          hash[i]=words[i].hashCode();
        }
//Count the intersections of hashes.
        for (int i = 0; i < hash.length; i++) {

            int count = 1;


            for (int j = i + 1; j < hash.length; j++) {
                if (hash[i].equals(hash[j])) {
                    count++;
                    hash[j] = 0;
                }
            }

            if (count > 1 && hash[i] != 0)

                 System.out.println("Hashcode: " + hash[i] + " repeats " +
                       count + " times ");
        }
    }
}