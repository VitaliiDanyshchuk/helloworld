/*
 * is Palindrom?.
 *
 * Version info 1
 *
 * Copyright Vitalii Danyshchuk

 */

package com.company;
import java.util.*;

public class Palindrom {
    public static void main (String[] args) {
        //Scanner in = new Scanner(System.in);
        //System.out.print("Input word: ");
        //String isPalindrom = in.nextLine();
        //in.close();
        String isPalindrom = "-\"Аргентина\", манит: негра?!...";
        System.out.println(isPalindrom);
        isPalindrom  = isPalindrom.toUpperCase();
        isPalindrom = isPalindrom.replaceAll(" ","");
        isPalindrom = isPalindrom.replaceAll("-","");
        isPalindrom = isPalindrom.replaceAll("\\.","");
        isPalindrom = isPalindrom.replaceAll(",","");
        isPalindrom = isPalindrom.replaceAll("\\?","");
        isPalindrom = isPalindrom.replaceAll("\"","");
        isPalindrom = isPalindrom.replaceAll("\\!","");
        isPalindrom = isPalindrom.replaceAll("-","");
        isPalindrom = isPalindrom.replaceAll(":","");

        StringBuffer buffer = new StringBuffer(isPalindrom);
        buffer.reverse();
        String opositeWord = buffer.toString();

        if(isPalindrom.equals(opositeWord)){
            System.out.println("Given String is palindrome");
        }
        else {
            System.out.println("Given String is not palindrome");
        }
    }
}

