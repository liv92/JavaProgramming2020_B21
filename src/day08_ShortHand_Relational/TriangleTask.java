package day08_ShortHand_Relational;

public class TriangleTask {

    public static void main(String[] args) {

        int angleA = 30, angleB = 30, angleC = 90;
        int sum = angleA + angleB + angleC;
        boolean isValid = sum == 180;

        System.out.println("The triangle is valid: "+isValid);


    }
}

/*
write a program that can check if the the given triangle is valid
            angle1 = 30
            angle2 = 30
            angle = 90
            sum = 150
            isValid
        output:
            The triangle is valid: false
 */