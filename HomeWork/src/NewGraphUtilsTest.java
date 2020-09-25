import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NewGraphUtilsTest {
    ArrayList<List<Integer>> graph;
    NewGraphUtils graphUtils = new NewGraphUtils();

    @BeforeEach
    public void init() {
        List<List<Integer>> temp = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(2, 3),
                Arrays.asList(1, 3),
                Arrays.asList(1, 2, 4),
                Arrays.asList(3, 5),
                Arrays.asList(4)

        );
        graph = new ArrayList<>(temp);
    }

    @Test
    public void testgetDistance_startEndFinishEqual_0() {
        assertEquals(0, graphUtils.bfs(graph, 0, 0));
    }
    @Test
    public void testgetDistance_startEndFinishAreNotEqual_0() {
        assertEquals(0, graphUtils.bfs(graph, 3, 3));
        assertEquals(0, graphUtils.bfs(graph, 4, 4));
    }

    @Test
    public void testgetDistance_startSingleAndFinishNot__1() {
        assertEquals(-1, graphUtils.bfs(graph, 0, 1));
    }

    @Test
    public void testgetDistance_startEndFinishConnected_1() {
        assertEquals(1, graphUtils.bfs(graph, 1, 2));
        assertEquals(1, graphUtils.bfs(graph, 2, 3));
        assertEquals(1, graphUtils.bfs(graph, 3, 1));
    }

    @Test
    public void testgetDistance_startEndFinishConnected_2() {
        assertEquals(2, graphUtils.bfs(graph, 1, 4));
        assertEquals(2, graphUtils.bfs(graph, 2, 4));
        assertEquals(2, graphUtils.bfs(graph, 3, 5));;
        assertEquals(2, graphUtils.bfs(graph, 4, 1));
        assertEquals(2, graphUtils.bfs(graph, 4, 2));
        assertEquals(2, graphUtils.bfs(graph, 5, 3));
    }

    @Test
    public void testgetDistance_startEndFinishConnected_3() {
        assertEquals(3, graphUtils.bfs(graph, 1, 5));
        assertEquals(3, graphUtils.bfs(graph, 2, 5));
    }

}