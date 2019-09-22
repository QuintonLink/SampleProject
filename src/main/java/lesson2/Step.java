package lesson2;
import java.util.Scanner;
public class Step {

    public static boolean step(int a){

        int c = 0;
        while(c == 0){

            if(a % 2 == 0){
             a = a / 2;
            }
            if(a == 1){
            return true;
            }
            if(a == 0){
            return false;
            }
            if(a % 2 != 0){
            c = 1;
            }

        }

        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(step(a));


    }
}
