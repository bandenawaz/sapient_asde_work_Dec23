import org.example.StringSwap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringSwapTest {

    @Test
    public void stringSwapToCharOnly(){

        StringSwap swap = new StringSwap();
        //Assertions.assertEquals("BA", swap.swapLastTwoChar("AB"));
        Assertions.assertEquals("ABDC", swap.swapLastTwoChar("ABCD"));
    }
}
