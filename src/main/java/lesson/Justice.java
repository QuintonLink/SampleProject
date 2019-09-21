package lesson;

import java.util.Scanner;


public class Justice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //create scanner


        System.out.println("Money:");
        int money= sc.nextInt();
        System.out.println("Family:");
        int countFamily=sc.nextInt();
        System.out.println("Price:");
        int price=sc.nextInt();



        if(money<0||countFamily<0||price<0){
            System.out.println("Ar u gay");
            System.exit(0);
        }

        if(money-(price*countFamily)>=0){
            System.out.println("U can buy it");
        }
        else{
            System.out.println("U can t buy it");
        }


    }
}
