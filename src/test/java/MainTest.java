import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    @Test
    void oddOrEvenTest(){
        String result = Main.oddOrEven(5);
        assertSame("odd", result);
    }
}
