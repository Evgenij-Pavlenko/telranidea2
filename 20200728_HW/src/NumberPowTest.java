import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPowTest {
    NumberPow numberPow = new NumberPow();

    @Test
    public void testNumberPow(){
        assertEquals(64, numberPow.numberToPow(8,2));
    }

}