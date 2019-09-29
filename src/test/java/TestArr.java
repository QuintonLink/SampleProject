import lesson4.Array;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestArr {


    @Test
    public void mid(){

        int[] mas = new int[10];




        for (int i = 0; i < mas.length; i++) {

            mas[i] = 3;

        }

        float result = Array.middle(mas);
        assertEquals(3.0, result);

    }

    @Test
    public void mid2(){


        int[] mas = {};

        float result = Array.middle(mas);
        assertEquals(0, result);


    }




}
