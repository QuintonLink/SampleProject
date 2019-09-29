import lesson4.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLogin {

    @Test
    public void testIncorrect(){
        boolean result = Login.login("putyril" , "pupytil");
        assertEquals(false, result);
    }


    @Test
    public void testCorrect() {
        boolean result = Login.login("pupil" , "pupil");
        assertEquals(true, result);
    }
}
