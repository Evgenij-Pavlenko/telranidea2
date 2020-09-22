import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DemoGraphTest {

    Graph g6 = new Graph(null, 6, 6);
    Graph g5 = new Graph(Arrays.asList(g6), 5, 5);
    Graph g4 = new Graph(Arrays.asList(g5), 4, 4);
    Graph g3 = new Graph(Arrays.asList(g4), 3, 3);
    Graph g2 = new Graph(Arrays.asList(g3), 2, 2);
    Graph g1 = new Graph(Arrays.asList(g2,g3,g4), 1, 1);

    DemoGraph demoGraph = new DemoGraph();
    @Test
    public void testDistance(){
        int actual = demoGraph.distance(g1, 1,2);
        assertEquals(1, actual);
    }


}