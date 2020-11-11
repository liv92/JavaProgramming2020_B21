package day12_NestedIf;

public class Muhtar_task01 {

    public static void main(String[] args) {

        int number = 10;
        String words = "";

        if (number >= 1 && number <= 9){
            if (number == 1){
                words = "A";
            }if(number == 2){
                words = "B";
            }if(number == 3){
                words = "C";
            }if(number == 4){
                words = "D";
            }if(number == 5){
                words = "E";
            }if(number == 6){
                words = "F";
            }if(number == 7){
                words = "G";
            }if(number == 8){
                words = "H";
            }if(number == 9){
                words = "I";
            }
        }else{
            words = "Invalid";
        }
        System.out.println(words);
    }
}

/*
   1. write a java program that can convert numbers between 0 ~ 9 to words,
   if the number is greater than 9 or less than zero, out put should be "Invalid".
 */