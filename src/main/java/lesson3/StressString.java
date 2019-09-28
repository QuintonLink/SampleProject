package lesson3;

import java.util.Scanner;

public class StressString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        int count = 0;

        for (int i = 0; i <a.length() ; i++) {

            if(a.charAt(i) == '!' ){

                count = count + 1;

            }

        }

        System.out.println(count + " Ex point");
    }
}
