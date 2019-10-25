package Homework;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Progressive {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("src\\main\\res\\progressive.txt");
        Scanner sc = new Scanner(reader);
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.nextInt());
        }
        int d = list.get(1) - list.get(0);
        int index = 0;
        for (int i = 0; i < list.size(); i++) {

            if(list.get(0)+((i)*d) != list.get(i)){
                index = -1;
                break;
            }
            else{
                index = 1;
            }
        }
        int q = list.get(1)/list.get(0);
        if(list.get(0) == 0){
            index = -1;
        }
        for (int i = 0; i < list.size(); i++) {

            if(list.get(0)*Math.pow(q,i) != list.get(i)){
                index = -1;
                break;
            }
            else{
                index = 2;
            }
        }
        if(index == 1){
            System.out.println("Это арифметическая прогрессия");
        }
        if(index == 2){
            System.out.println("Это геометрическая прогрессия");
        }
        if(index == -1){
            System.out.println("Это не является прогрессией");
        }
    }
}
