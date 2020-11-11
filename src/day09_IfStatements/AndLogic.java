package day09_IfStatements;

public class AndLogic {

    public static void main(String[] args) {

        String name = "Daniel";
        boolean isUSACitizen = true;
        int age = 38;
        boolean criminalBackground = false;

        boolean isEligible = isUSACitizen == true && age >= 18 && criminalBackground == false;
        System.out.println(isEligible);




    }
}
