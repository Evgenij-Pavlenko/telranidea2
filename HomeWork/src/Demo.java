import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Demo {

    public List<Integer> leftToRight(Node root) {
        Deque<Node> deq = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        deq.add(root);
        while (deq.size() > 0) {
            Node tempNode = deq.getFirst();
            res.add(tempNode.date); //вытаскиваем с противоположной стороны
            if (tempNode.left!=null)
                deq.add(tempNode.left);
            if (tempNode.right!=null)
                deq.add(tempNode.right);
            deq.removeFirst();
        }
        return res;
    }
}
