package tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tree.Node.height;

/*
        5
      /   \
     3     7
          /  \
         6    9
             /
             8
 */

class NodeTest {
    Node three = new Node(null, null, 3);
    Node six = new Node(null, null, 6);
    Node eight = new Node(null, null, 8);
    Node nine = new Node(eight, null, 9);
    Node seven = new Node(six, nine, 7);
    Node five = new Node(three, seven, 5);

    @Test
    public void testHeight_5_4() {
        assertEquals(4, height(five));
    }

    @Test
    public void testHeight_7_3() {
        assertEquals(3, height(seven));
    }

    @Test
    public void testHeight_3_1() {
        assertEquals(1, height(three));
    }

    @Test
    public void testHeight_6_1() {
        assertEquals(1, height(six));
    }

    @Test
    public void testHeight_9_2() {
        assertEquals(2, height(nine));
    }

    @Test
    public void testHeight_8_1() {
        assertEquals(1, height(eight));
    }
}