package lesson3;

import java.util.Scanner;

public class Badword {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String bad = sc.nextLine();
        String voc = sc.nextLine();

        if(voc.contains(bad) == true){

            System.out.println("Est");
        } else{
            System.out.println("Net");
        }


    }
}
