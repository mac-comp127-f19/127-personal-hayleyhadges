import comp127.Hypotenuse;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HypotenuseTest {


    @Test
    public void testHypotenuse() {

        assertEquals(5, Hypotenuse.calculateHypotenuse(3,4));


    }

}
