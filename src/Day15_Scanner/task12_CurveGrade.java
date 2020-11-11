package Day15_Scanner;

import java.util.Scanner;

public class task12_CurveGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter curve for class below: ");
        double curve = sc.nextDouble();

        if(curve >= 0 && curve < 101) {
            System.out.println("Please enter grade for class below: ");
            double grade = sc.nextDouble();
            double gradeAfterCurve = (curve / 100) * grade + grade;
            if (grade >= 0) {
                System.out.println("Please enter True or False below if you completed extra credit assignment: ");
                boolean extraCredit = sc.hasNextBoolean();
                if (extraCredit == true && gradeAfterCurve <90)
                    System.out.println("Final grade is: " + (gradeAfterCurve + 2));
                else if (extraCredit == !true)
                    System.out.println("Final grade is: " + gradeAfterCurve);
            }else
                System.out.println("Invalid Grade");

        }else
            System.out.println("Invalid Curve");

        double a1 = sc.nextDouble();

    }
}

/*
Ask the user to enter the curve percentage for the class and to enter their grade to determine
if the curve will allow them to get an A (>= 90). [Use double datatype]
    - In the case the given curve is more than 100 or less than 0, print Invalid curve
    - In the case the given grade is less than 0, print invalid grade
    - In the case the student was not able to get an A after the curves (grade was less than 90).
        Ask them if they did the extra credit assignments(boolean)
        If the student did the extra credit add 2 whole percentage to their grade
    Ex: 15, 80 --> 92.0 after curve. Final Grade:  92.0
    Ex: 25, 55 --> 68.75 after curve, Did you do extra credit -> false -> Final grade: 68.75
    Ex: 20, 60 --> 72.0 after curve, Did you do extra credit -> true -> Final grade: 74.0
    Hint: (curve value / 100) --> Percentage value of the curve
 */