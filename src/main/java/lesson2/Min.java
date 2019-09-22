package lesson2;

import java.util.Scanner;









public class Min {

    public static int minNum(int a, int b, int c){
        if(a > b && c > b){
        return b;
        }
        if(b > a && c > a){
        return a;
        }
        return c;
    }

    public static void main(String[] args) {
        /*  Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = sc.nextInt();
        System.out.println("Input b: ");
        int b = sc.nextInt();
        System.out.println("Input c: ");
        int c = sc.nextInt();




        if(a > b && c > b){
            System.out.println("Min: " + b);
        }
        if(b > a && c > a){
            System.out.println("Min: " + a);
        }
        if(b > c && a > c) {
            System.out.println("Min: " + c);
        }
    */
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(minNum(a,b,c));



    }
}
