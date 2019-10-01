package Homework;
import java.util.Scanner;
public class Politeness {
    public static boolean polit(String f){

        if(f.indexOf("Здравствуйте") == 0 ) {
            return true;
        }

        if(f.indexOf("Привет") == 0 ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(polit(a));
    }


}

