package lesson6;

import com.github.javafaker.Faker;
import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.*;

public class ArrayListEx {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        Set<List> strings = new HashSet<List>();
        Faker fak = new Faker(new Locale("ru"));


        for (int i = 0; i < 20 ; i++) {
            list.add(fak.dog().age());
        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("\n");


        for (int i = 0; i < list.size(); i++) {

            String st = list.get(i);

            for (int j = 0; j < list.size() ; j++) {

                if(i == j){
                    j++;
                }
                if(list.get(j) == st){
                    list.remove(j);
                }

            }




        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        for (String x : list ) {
            System.out.println(x);
        }







    }

}
