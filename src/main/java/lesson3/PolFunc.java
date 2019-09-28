package lesson3;

public class PolFunc {

    public static boolean func(String a){

        String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {

            b = b + a.charAt(i);
        }

        if(a.equals(b)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {


        System.out.println(func("anna"));

    }


}


