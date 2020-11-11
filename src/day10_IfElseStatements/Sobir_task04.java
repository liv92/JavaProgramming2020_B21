package day10_IfElseStatements;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

public class Sobir_task04 {

    public static void main(String[] args) {

        int aviation1 = 10;
        int temp = 61;
        boolean isCold = temp < 60;
        boolean isHot = temp > 60;

        if (isCold){
            System.out.println(--aviation1);
        }else {
            System.out.println(++aviation1 + 1);
        }



    }
}
/*
4) Aviation part length is 10 in.
When it's cold it's shrinks by 1 in and when it's hot it swells by 2 in.
Please calculate length of the combination of 5 parts using if/else statement and increment and decrement assignment
and print out the result.
 */