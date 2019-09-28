package lesson3;

import java.util.Scanner;

public class LabEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float l = sc.nextFloat();
        float e = sc.nextFloat();
        float i = sc.nextFloat();

        while(i != 0){
            
            if(i >= (l-e) && i <= (l+e)){
                System.out.println("Ok");
            } else {
                System.out.println("Ne ok");
            }
            i = sc.nextFloat();

        }

    }

}
