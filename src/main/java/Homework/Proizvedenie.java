package Homework;
import java.util.Scanner;
public class Proizvedenie {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int mainNum = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(mainNum % a == 0 && mainNum % b == 0 && mainNum % c == 0 && a * b * c <= mainNum){ //я так до конца и не понял работает это или нет
            System.out.println(1);
        } else{
            System.out.println(0);
        }


    }
}
