package day11_MultiBranchIf;

public class MaxMinNumber1_Ternary {

    public static void main(String[] args) {

       int n1 = 10;
       int n2 = 20;
       String isMax = " ";

       if (n1 > n2){
           isMax = n1+" is max.";
       }else{
           isMax = n2+" is max.";
       }
        System.out.println(isMax);

       String isMax2 = (n1 > n2) ? n1+" is max." : n2+" is max.";
        System.out.println(isMax2);

    }
}
/*
write program tht can find max number between two numbers
first solution: if/else statement
second solution: do not use any if statement
 */