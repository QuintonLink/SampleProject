package lesson;

import java.util.Scanner;

public class Money {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nominal = -1;
        int count = 0;
        int max = 0;
        while(nominal != 0){
            System.out.println("Nominal:");
            nominal = sc.nextInt();
            count= count + nominal;
            if(max < nominal){
                max = nominal;
            }
        }

        System.out.println("You find: " + count);
        System.out.println("Max nominal: " + max);
    }
}
