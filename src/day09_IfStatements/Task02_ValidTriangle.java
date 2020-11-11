package day09_IfStatements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Task02_ValidTriangle {

    public static void main(String[] args) {

        int angle1 = 45;
        int angle2 = 45;
        int angle3 = 90;
        boolean isTriangle = angle1 + angle2 + angle3 == 180;

        if(isTriangle){
            System.out.println("Triangle is valid.");
        }

        if(!isTriangle){
            System.out.println("Triangle is not valid.");
        }

        System.out.println("abc"+ (1) + (2));

    }
}

/*
 A triangle is valid if the sum of all the three angles is equal to 180 degrees.
  Write a program that declares three integers as angles and check whether a triangle is valid or not.

 */