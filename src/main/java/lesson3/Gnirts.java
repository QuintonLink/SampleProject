package lesson3;

import java.util.Scanner;

public class Gnirts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        String ts = "";

        for (int i = st.length()-1; i >= 0; i--) {

            ts = ts + st.charAt(i);

        }

        System.out.println(ts);

    }

}
