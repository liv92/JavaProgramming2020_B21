package day10_IfElseStatements;

public class Sobir_task08 {

    public static void main(String[] args) {

      boolean hasVodka = false;
      boolean hasBeer = !hasVodka;
      if (hasVodka || hasBeer){
          System.out.println("Successful");
      }else{
          System.out.println("Unsuccessful");
      }
    }
}

/*
Your party will be successful if either of conditions are met:
hasVodka = true/false
HasBeer has to be opposite of hasVodka
You have to choose to use && or|| operator in if/else statement and print out the result.
 */