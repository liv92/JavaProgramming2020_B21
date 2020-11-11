package day10_IfElseStatements;

public class task02_Atilla {

    public static void main(String[] args) {

        int speedLimitMPH = 55;
        int currentSpeed = 60;

        boolean pulledOver = currentSpeed  == speedLimitMPH + 5;
        boolean ticket = currentSpeed == speedLimitMPH + 15;
        boolean pointsAndTicket = currentSpeed == speedLimitMPH + 25;
        boolean court = currentSpeed == speedLimitMPH + 30;

        if (pulledOver){
            System.out.println("Pulled over");
        }
        if (ticket){
            System.out.println("Given ticket");
        }
        if (pointsAndTicket){
            System.out.println("Given points on license and ticket");
        }
        if (court){
            System.out.println("Given court date");
        }
    }
}

/*
if current speed is more than speed limit    print get pulled over by cops,
if 5 km/h over the speed limit         given ticket by cops,
if 15 km/h over the speed limit         taken away some points and given ticket,
if 25 km/h over the spend limit.         go to court,
if more than 30 km/h over the speed limit.
 */
