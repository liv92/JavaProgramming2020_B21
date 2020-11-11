package day12_NestedIf;

public class WarmUp1 {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 10;
        int n3 = 10;

        if(n1 == n2 && n2 == n3 ){
            System.out.println("all are equal");
        }else if(n2 == n3){
            System.out.println("n2 & n3 are equal");
        }else if(n3 == n1){
            System.out.println("n3 and n1 are equal");
        }else if( n1 == n2 ){
            System.out.println("n1 & n2 are equal");
        }else{
            System.out.println("none of them are equal");
        }

    }
}
/*
write a program that can check the equality of the three given numberrs
                declare 3 numbers n1, n2, n3
                if n1 and n2 are equal  => n1&n2 are equal
                if n2 and n3 are equal ==> n2&n3 are equal
                if n3 and n1 are qual ==>n3&n1 are equal
                if all equal ==> all equal
                if none of them are euqal ==> none of them are equal

 */