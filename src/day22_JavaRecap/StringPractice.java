package day22_JavaRecap;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots = 0;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;

        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        switch(houseType){
            case "Condo": propertyPrice = 50000; break;
            case "Townhouse": propertyPrice = 75000; break;
            case "Single Family Home": propertyPrice = 95000; break;
        }

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        numberOfBedrooms *= 30000;
        propertyPrice += numberOfBedrooms;

        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if(houseType.equals("Condo")){
            System.out.println("Backyard is not available for condo!");
        }else if(backyard){
            propertyPrice += 5000;
        }

        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        if(garage){
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
        }if(garageSpots > 10){
            System.out.println("Pardon, it's not a public parking!");
        }else{
            for(int i = 1; i <= garageSpots; i++){
                propertyPrice += 20000;
            }
        }

  /*      System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if(metroAccessibility <= 1){
            propertyPrice += 10000;
        }else if(metroAccessibility <= 3){
            propertyPrice += 5000;
        }

        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if(highwayAccessibility <= 1){
            propertyPrice += 15000;
        }else if(highwayAccessibility <= 5){
            propertyPrice += 8000;
        }else if (highwayAccessibility <= 20){
            propertyPrice += 4000;
        }

        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if(schoolScore <= 10){
            propertyPrice += 45000;
        }else if (schoolScore < 8 && schoolScore >= 4){
            propertyPrice += 20000;
        }else{
            propertyPrice += 5000;
        }

        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();
        if(smoking){
            propertyPrice -= 5000;
        } */

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+propertyPrice+"$");


    }
}
