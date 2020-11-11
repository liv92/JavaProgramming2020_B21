package Day15_Scanner;

import java.util.Scanner;

public class task08_Grade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first grade below: ");
        int grade1 = sc.nextInt();

        System.out.println("Enter second grade below: ");
        int grade2 = sc.nextInt();

        System.out.println("Enter final grade below: ");
        int grade3 = sc.nextInt();

        int averageGrade = (grade1 + grade2 + grade3) / 3;

            if(averageGrade >= 90)
                System.out.println("A");
            else if (averageGrade < 90)
                System.out.println("B");
            else if (averageGrade < 80)
                System.out.println("C");
            else if (averageGrade < 70)
                System.out.println("D");
            else
                System.out.println("F");

    }
}

/*
The marks obtained by a student in 3 different subjects are input by the user.
Your program should calculate the average of subjects. The student gets a grade as per the following rules:
    90-100  A
    80-89   B
    70-79   C
    60-69   D
    0-59    F
    Ex: 86, 74, 90 -> B
 */