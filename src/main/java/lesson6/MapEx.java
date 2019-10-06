package lesson6;
import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;


public class MapEx {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();


        Faker fak = new Faker(new Locale("ru"));
        Random rand = new Random();

        Integer a = map.get("NN");
        Double b = new Double(4.76);

        for (int i = 0; i < 10 ; i++) {
            map.put(fak.name().firstName(),rand.nextInt(500));
        }

        for (Map.Entry<String,Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + " : " + value);
        }


    }

}
