package day10_IfElseStatements;

public class Sobir_task06 {

    public static void main(String[] args) {

        boolean areAllTicketsSold = false;
        boolean isStormyWeather = false;
        boolean isAirplaneFixed = true;
        boolean allowFlight = !areAllTicketsSold && !isStormyWeather && isAirplaneFixed;

        if (allowFlight){
            System.out.println("Allow flight");
        }else {
            System.out.println("Do not allow flight");
        }

    }
}

/*
Airline flight manager decides where or not to allow flight depending on condition:
areAllTiketsSold = true/false
isStormyWeather = true/false
isAirplaneFixed = true/false
You have to decide should you use && or || operator in if/else statement and print out the result.
 */