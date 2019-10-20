package lesson10;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(FileWriter writer = new FileWriter("C:\\Users\\pupil\\Desktop\\mainfile.txt", false)){

            System.out.println("Введи колтчество чисел");
            int n = sc.nextInt();
            Random rand = new Random();

            for (int i = 0; i < n ; i++) {
                writer.write(String.valueOf(rand.nextInt(100)));
                writer.write(" ");
            }

            writer.flush();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
