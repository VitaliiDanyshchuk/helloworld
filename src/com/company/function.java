/*
 * Function
 *
 * Version info 1
 *
 * Copyright Vitalii Danyshchuk

 */

package com.company;

import java.io.IOException;

public class function {

    public static void main(String[] args) throws IOException {


                double start = 0;
                double finish = Math.PI;
                double deltaX = 0.1;
                double area = 0;
                double y = 0.3;

                for (double x = 0; x < finish; x+=deltaX) {
                    double rectangle = 0;
                    if(Math.sin(x) < y) {
                        rectangle = Math.sin(x) * deltaX;
                    }
                    else {
                        rectangle = y *deltaX;
                    }
                    area += rectangle;
                }
                System.out.println(area);
               }
}
