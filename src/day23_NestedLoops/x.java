package day23_NestedLoops;

import java.util.Scanner;

public class x {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String split = "";
        int numOfPeople = 0;
        double check = 0;
        double tip = 0;
        double totalPay = 0;
        double tipPerPerson = 0;
        double totalPerPerson = 0;

        System.out.println("Split:");
        split = sc.nextLine(); // Yes / No

        if(split.equals("Yes")){
            System.out.println("Number of people:");
            numOfPeople = sc.nextInt();

            sc.nextLine();

            System.out.println("Check amount:");
            check = sc.nextDouble();

            sc.nextLine();

            System.out.println("Service Quality:");
            String serviceQuality = sc.nextLine();
            switch(serviceQuality){
                case "Poor": tip = check*0.05; break;
                case "Fair": tip = check*0.1; break;
                case "Good": tip = check*0.15; break;
                case "Great": tip = check*0.2; break;
                case "Excellent": tip = check*0.25; break;
            }

            totalPay = check + tip;
            totalPerPerson = totalPay / numOfPeople;
            tipPerPerson = tip / numOfPeople;


            String specialChar = "";
            for(int i = 1; i <= numOfPeople; i++){
                specialChar += "&";
            }

            System.out.println("Number of people entered: "+specialChar);

            System.out.println("Total to pay: "+totalPay);

            System.out.println("Total tip: "+tip);

            System.out.println("Total per person: "+totalPerPerson);

            System.out.println("Tip per person: "+tipPerPerson);

        }else if(split.equals("No")){

            System.out.println("Number of people:");
            numOfPeople = sc.nextInt();

            sc.nextLine();

            System.out.println("Check amount:");
            check = sc.nextDouble();

            sc.nextLine();

            System.out.println("Service Quality:");
            String serviceQuality = sc.nextLine();
            switch(serviceQuality){
                case "Poor": tip = check*0.05; break;
                case "Fair": tip = check*0.1; break;
                case "Good": tip = check*0.15; break;
                case "Great": tip = check*0.2; break;
                case "Excellent": tip = check*0.25; break;
            }

            totalPay = check + tip;

            String specialChar = "";
            for(int i = 1; i <= numOfPeople; i++){
                specialChar += "&";
            }

            System.out.println("Number of people entered: "+specialChar);

            System.out.println("Total to pay: "+totalPay);

            System.out.println("Total tip: "+tip);

            System.out.println("Total per person: "+totalPay);

            System.out.println("Tip per person: "+tip);

        }

    }
}
