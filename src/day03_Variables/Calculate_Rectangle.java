package day03_Variables;

public class Calculate_Rectangle {
// write program that can calculate the area & perimeter of any rectangle that has an int number.

    public static void main(String[] args) {
// width: 10, length: 20

        int width = 10;
        int length = 20;
        int area = width * length;
        int perimeter = width * 2 + length * 2;

        System.out.println("");
        System.out.println("Area is:");
        System.out.println(area);
        System.out.println("");
        System.out.println("Perimeter is: ");
        System.out.println(perimeter);
    }

}
