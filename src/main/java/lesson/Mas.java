package lesson;

public class Mas {
    public static void main(String[] args) {
        int[] mas;
        mas=new int[10];

        for (int i = 0; i < 10; i++) {
            mas[i] = (int) (Math.random()*100);
        }
        int temp;

        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - i - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.println(mas[i]);
        }
    }
}
