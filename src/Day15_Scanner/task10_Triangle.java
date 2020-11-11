package Day15_Scanner;

import java.util.Scanner;

public class task10_Triangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first angle value of triangle below: ");
        double angle1 = sc.nextDouble();

        System.out.println("Please enter second angle value of triangle below: ");
        double angle2 = sc.nextDouble();

        if(angle1 + angle2 >= 180)
            System.out.println("Invalid angles");
        else
            System.out.println("Third angle is: "+(180 - (angle1 + angle2)));

    }
}

/*
Ask the user to enter two angle values (double).
Find out what the third angle of the triangle is (Triangles have 180 degrees total).
If the two angle values given exceed 180 already print "Invalid angles"
 */