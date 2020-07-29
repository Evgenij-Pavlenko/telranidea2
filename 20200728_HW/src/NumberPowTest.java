import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPowTest {
    NumberPow numberPow = new NumberPow();

    @Test
    public void testNumberPow(){
        assertEquals(64, numberPow.numberToPow(8,2));
    }

    @Test
    public void testNumberPow2_numAndPower_numInPower(){
        assertEquals(64, numberPow.numberToPow(8,2));
    }

    @Test
    public void testNumberPow2_someNumAndPower0_numInPower(){
        assertEquals(1, numberPow.numberToPow(8,0));
    }

}