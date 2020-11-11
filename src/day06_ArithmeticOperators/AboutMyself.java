package day06_ArithmeticOperators;

public class AboutMyself {

    public static void main(String[] args) {

        String firstName = "Livio";
        String lastName = "Daljani";
        String fullName = firstName+" "+lastName;
        String from = "Italy";
        String favBook = "Think Rich Grow Rich";
        String favShow = "DBZ";

        System.out.println("Full name is: "+fullName);
        System.out.println("From: "+from);
        System.out.println("Favorite book is: \""  + favBook + "\"");
        System.out.println("Favorite Show is: " +  "\"" + favShow + "\"" );

        System.out.println("Favorite show is: " + "\"" + favShow + "\"");


    }
}

/*
Task01: AboutMyself
    variables: firstName, lastName, fullName, from, favoriteBook, favoriteShow
    output:
        Full name is: YourFullName
        From: YourCountryName
        Favorite book is: "YourFavovoriteBook"
        Favorite Show is: "YourFavoriteShow"
 */