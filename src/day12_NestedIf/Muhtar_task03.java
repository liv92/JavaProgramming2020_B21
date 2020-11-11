package day12_NestedIf;

public class Muhtar_task03 {

    public static void main(String[] args) {

        int age = 28;
        String ageGroup = "";

        if(age >=0 && age <= 150){
            if(age < 21){
                ageGroup = "Teenager";
            }else if(age >= 21 && age < 55){
                ageGroup = "Adult";
            }else if(age > 55){
                ageGroup = "Seniors";
            }
        }else{
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);
    }
}
/*
write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                Hint:  age cannot be negative or greater than 150
 */