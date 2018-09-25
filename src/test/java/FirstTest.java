import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class FirstTest {

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }
    @Test
    void anotherTest(){
        assertFalse((2*2)>(9*2));
    }
}
