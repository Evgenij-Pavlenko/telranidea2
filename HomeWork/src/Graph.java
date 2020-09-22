import java.util.List;

public class Graph {
List<Graph> neighbors;
    int value;
    int index;

    public Graph(List<Graph> neighbors, int value, int index) {
        this.neighbors = neighbors;
        this.value = value;
        this.index = index;
    }
}
