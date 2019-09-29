package lesson4;

import java.util.Scanner;

public class Login {

    public static boolean login(String a, String b){


        String login = "pupil";
        String password = "pupil";

        if(login.equals(a) && password.equals(b)){
            return true;
        }
        return false;


    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String log = sc.next();
        String pas = sc.next();

        System.out.println(login(log,pas));


    }

}
