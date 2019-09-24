package lesson;
import java.util.Scanner;
public class QuadUr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Input a: ");
        int a = sc.nextInt();
        System.out.println("Input b: ");
        int b = sc.nextInt();
        System.out.println("Input c: ");
        int c = sc.nextInt();
        double D = Math.sqrt((b*b)-4*a*c);

        if(D>0){
         double x1 = (-b+D)/(2*a);
         double x2 = (-b-D)/(2*a);
        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);
        }


        if(D == 0) {
            int x = -b / (2 * a);
            System.out.println("x=" + x);
        } else{
            System.out.println("Ar u gay");
        }
    }
}
