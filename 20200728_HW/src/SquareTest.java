import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square = new Square();

    @Test
    public void testSquare_number8_squareIs64() {
        assertEquals(64, square.square(8));
    }

    @Test
    public void testSquare_number8_squareIs64_2() {
        assertEquals(64, square.square2(8));
    }
}