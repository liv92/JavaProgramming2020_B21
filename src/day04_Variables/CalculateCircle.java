package day04_Variables;

public class CalculateCircle {

    public static void main(String[] args) {
        /*
        write a program that can calculate the area and perimeter of the circle based on the given radius
        Hints: Area of circle = r * r * PI
              Perimeter of circle = 2 * r * PI
         */

        //r: 7.5
        double r = 7.5;
        double pi = 3.14;

        double area = r * r * pi;
        double perimeter = 2 * r * pi;

        System.out.print("Area of the circle is: ");
        System.out.println(area);
        System.out.print("Perimeter of the circle is: ");
        System.out.println(perimeter);



    }

}
