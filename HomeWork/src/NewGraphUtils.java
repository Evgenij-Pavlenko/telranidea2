import java.util.*;
/*
2. Расстояние между двумя вершинами — кратчайший путь между ними.
3. Есть метод int Distance(ArrayList<ArrayList<Integer>> graph, int start, int finish)
(найти расстояние между start и finish)
 */
public class NewGraphUtils {

    public int bfs(ArrayList<List<Integer>> graph, int startId, int finishId){
        Deque<Integer> nodesQueue = new ArrayDeque<>();
        nodesQueue.addFirst(startId);
        int[] distances = new int[graph.size()];
        Arrays.fill(distances, -1);
        distances[startId] = 0;

        while(nodesQueue.size()>0){
            int currentNode = nodesQueue.removeLast();
            if (currentNode == finishId){
                return distances[currentNode];
            }
            List<Integer> neighbours = graph.get(currentNode);
            for (int neighbour: neighbours){
                if (distances[neighbour]==-1){
                    nodesQueue.addFirst(neighbour);
                    distances[neighbour] = 1+distances[currentNode];

                }
            }
        }
        return -1;
    }
}
