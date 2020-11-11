package day12_NestedIf;

public class task04_version2 {

    public static void main(String[] args) {

        String browserName = "opera";
        String result="";

        if(browserName == "firefox"||browserName == "opera"||browserName == "chrome"||browserName == "safari"){
            System.out.println(browserName+ " browser is Selected");
        }else{
            result="Invalid Browser Name";
        }
        System.out.println(result);
}
}
