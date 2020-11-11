package day10_IfElseStatements;

public class Sobir_task10 {

    public static void main(String[] args) {

        int algebraMin = 70;
        int geometryMin = 60;
        int biologyMin = 50;
        boolean graduate = algebraMin >= 70 && geometryMin >= 60 && biologyMin >=50;
        if (graduate){
            System.out.println("Graduated");
        }else{
            System.out.println("Failed");
        }
    }
}

/*
Student will be graduated if he got higher than minimum score in subjects:
algebraMin = 70
geometryMin = 60
biologyMin = 50
You have to choose to use && or || operator in if/else statement and print out the result
 */