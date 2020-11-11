package day03_Variables;

public class Calculate_Square { //area and perimeter

    public static void main(String[] args) {

        //side: 10

        int side = 8; //makes the 'side' data reusable throughout the class

        int area = side * side; //area is now reusable

        int perimeter = side * 4; //perimeter is now a reusable data point by using side

        System.out.print("Area of Square is: ");
        System.out.println(area);

        System.out.print("Perimeter of Square is: ");
        System.out.println(perimeter);
        System.out.println("=====================================================\n");

        System.out.println();



    }

}
