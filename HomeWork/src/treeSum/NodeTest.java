package treeSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static treeSum.Node.sum;

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
    public void testSum_5_38() {
        assertEquals(38, sum(five));
    }

    @Test
    public void testSum_7_30() {
        assertEquals(30, sum(seven));
    }

    @Test
    public void testSum_3_3() {
        assertEquals(3, sum(three));
    }

    @Test
    public void testSum_6_6() {
        assertEquals(6, sum(six));
    }

    @Test
    public void testSum_9_17() {
        assertEquals(17, sum(nine));
    }

    @Test
    public void testSum_8_8() {
        assertEquals(8, sum(eight));
    }
}