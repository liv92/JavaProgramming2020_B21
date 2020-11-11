package day13_SwitchStatements;

public class CharStatement {

    public static void main(String[] args) {

        char x = 'c';
        String y = "";

        switch (x){
            case 'A': y = "1"; break;
            case 'B': y = "2"; break;
            case 'C': y = "3"; break;
            case 'D': y = "4"; break;
            case 'E': y = "5"; break;
            default: y = "not found";
        }
        System.out.println(y);
    }
}
