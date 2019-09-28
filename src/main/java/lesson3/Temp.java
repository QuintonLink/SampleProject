package lesson3;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input temp");
        float temp = sc.nextFloat();

        if((temp >= 36.5f) && (temp <= 36.7f)){
            System.out.println("Ok");
        } else{
            System.out.println("Ne ok");
        }





    }
}
