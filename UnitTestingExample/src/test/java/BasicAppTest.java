import org.example.BasicApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicAppTest {
    @Test
    @DisplayName("First Number is Less than second number")
    public void compare(){

        BasicApp basicApp = new BasicApp();
        int val = basicApp.compare(4,3);
        Assertions.assertEquals(-1,val);
    }
}
