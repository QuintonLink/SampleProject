package lesson6;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Fuker {

    public static void main(String[] args) {
        Faker fk = new Faker(new Locale("ru"));
        for (int i = 0; i < 20 ; i++) {
            System.out.println(fk.name().fullName());
        }
    }

}
