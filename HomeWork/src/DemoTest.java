import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    Node n13 = new Node(null, null, 13);
    Node n1 = new Node(null, null, 1);
    Node n2 = new Node(null, null, 2);
    Node n5 = new Node(n13, null, 5);
    Node n11 = new Node(n1, n2, 11);
    Node n8 = new Node(n5, n11, 8);
    Demo demo = new Demo();

    @Test
    public void testLeftToRight(){
        List<Integer> expected = Arrays.asList(8,5,11,13,1,2);
        List<Integer> actual = demo.leftToRight(n8);
        assertEquals(expected, actual);
    }

}