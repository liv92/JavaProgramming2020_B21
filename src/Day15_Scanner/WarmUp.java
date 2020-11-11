package Day15_Scanner;

public class WarmUp {

    public static void main(String[] args) {

        int numberOfPeople = 50;
        int crew = 0;
        int passengers = 0;

        switch (numberOfPeople){
            case 50:
                crew = 20;
                passengers = 30; break;

            case 75:
                crew = 25;
                passengers = 50; break;

            case 100:
                crew = 30;
                passengers = 70; break;

            default:
                System.out.println("Invalid number of people");
        }
        System.out.println("If we have "+numberOfPeople+" people onboard, there are "+crew+" crew members and "+passengers+" passengers.");
    }
}

/*
1) Given a number of people on the ship determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.
    Total: 50 | 20 crew, 30 passengers
    Total: 75 | 25 crew, 50 passengers
    Total: 100 | 30 crew, 70 passengers
    Any other number of people on the ship is not valid
 */