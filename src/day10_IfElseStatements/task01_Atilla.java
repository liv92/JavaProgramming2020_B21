package day10_IfElseStatements;

public class task01_Atilla {

    public static void main(String[] args) {

        int grade = 100;

        boolean perfectGrade = grade == 100;
        boolean goodGrades = grade >= 80 && !perfectGrade;
        boolean badGrades = grade <= 60 && !goodGrades;
        boolean failGrades = !perfectGrade && !goodGrades && !badGrades;
        boolean invalidRange = grade < -1 && grade > 101;

        if (perfectGrade){
            System.out.println("Excellent");
        }
        if (goodGrades){
            System.out.println("Good");
        }
        if (badGrades){
            System.out.println("You have to put in more effort");
        }
        if (failGrades){
            System.out.println("You failed");
        }
        if (invalidRange){
            System.out.println("Invalid");
        }
    }
}
/*
Declare an int grade, and store a value in grade.
If a student has a grade of 100, print excellent.
If grade is greater than 80 and smaller than 100, print “good”.
If grade is greater than 60 and smaller than 80, print “You have to put in more effort”.
If grade is smaller than 60, print “you failed”. If any other numbers entered except the range of 0 and 100, print “Invalid”.
 */