import Homework.Politeness;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PolitenessTest {

    @Test
    public void polit1(){
        boolean result = Politeness.polit("Привет чувырла");
        assertEquals(true, result);
    }

    @Test
    public void polit2(){
        boolean result = Politeness.polit("Здравствуйте ваша мама хорошая женщина");
        assertEquals(true, result);
    }

    @Test
    public void polit3(){
        boolean result = Politeness.polit("Досвидания");
        assertEquals(false, result);
    }

    @Test
    public void polit4(){
        boolean result = Politeness.polit("");
        assertEquals(false, result);
    }
}
