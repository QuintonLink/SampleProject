package lesson4;

import java.util.Random;

public class Array {

    public static int countZero(int[] arr){

        int count = 0;

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i] == 0){
                count++;
            }

        }

        return count;
    }


    public static float middle (int[] arr){

        int a = 0;

        for (int i = 0; i < arr.length ; i++) {

            a = a + arr[i];

        }

        if(arr.length == 0){
            return 0;
        }

        return a/arr.length;
    }




    public static void main(String[] args) {


        Random rnd = new Random();

        int n=10;
        int[] mas = new int[n];

        for (int i = 0; i <mas.length ; i++) {

            mas[i] = rnd.nextInt(100);
            System.out.println(mas[i]);


        }


        System.out.println(middle(mas));



    }


}
