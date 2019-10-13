package lesson8.Crud;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserService userService = new UserService();
        //scanner
        //auth
        //while
        //считывющие команды
        //switch
        int a = 1;
        while (a == 1) {
            System.out.println("Введите логин");
            String log = sc.nextLine();
            System.out.println("Введите пароль");
            String pas = sc.nextLine();

            if (userService.auth(log, pas)) {
                a = 0;
            } else {
                System.out.println("Пoвторите попытку");
            }
        }


    }


    }


