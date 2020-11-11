package day05_Concatenation;

public class Concatenation_Practice {

    public static void main(String[] args) {

        String streetName = "Brighton Street";
        int  houseNumber = 845;
        String cityName = "Philadelphia";
        String stateName = "PA";
        int zipCode = 19111;

        String fullAddress = houseNumber+" "+streetName+"\n"+cityName+" "+stateName+", "+zipCode;

        System.out.println(fullAddress);

        System.out.println("==========================================================================");

        String brand = "Toyota";
        String model = "Camry";
        int year = 2010;
        int mileage = 55000;
        double price = 18000;
        String color = "Black";

        // 2010 Toyota Camry, 55000 miles, Red color, listed at $18000

        String carInfo = year+" "+brand+" "+model+", "+mileage+", "+mileage+", "+color+", Listed at $"+price;

        System.out.println(carInfo);

    }
}
