import lesson2.Min;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestMin {

    @Test
    public void testPol(){
        int result = Min.minNum(3,6,9);
        assertEquals(3,result);
    }

    @Test
    public void testOt(){
        int result = Min.minNum(5,-8,0);
        assertEquals(-8, result);
    }

    @Test
    public void testAll0t(){
        int result = Min.minNum(-7,-8,-100);
        assertEquals(-100, result);
    }
    @Test
    public void testEquals(){
        int result = Min.minNum(6,6,6);
        assertEquals(6, result);
    }
    @Test
    public void testTwo(){
        int result = Min.minNum(6,6,3);
        assertEquals(3, result);
    }

    @Test
    public void testTwEquals(){
        int result = Min.minNum(6,6,9);
        assertEquals(6, result);
    }



}
