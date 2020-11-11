package day23_NestedLoops;

public class CatAndDog {

    public static void main(String[] args) {

        String sentece = "dog dog Dog Dog cat CAT cAt CAt";

        String temp = sentece.toLowerCase(); // after this do not need to worry about case sensitivity

        int countDog = 0;
        int countCat = 0;

        while(temp.contains("dog")){
            temp = temp.replaceFirst("dog", "");
            countDog++;
        }
        System.out.println(countDog);

        while(temp.contains("cat")) {
            temp = temp.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println(countCat);


    }
}
