package treeSum;

/*
2. class Node{
Node left;
Node right;
int data; //данные — в данном случае для дерева int
} - таким образом можно записать любое дерево
Написать функцию int height(Node root)
*рекурсивно решается. Высота из родительской вершины равна максимуму высоты от дочерних элементов (левого и правого) +1
Двигаться вниз, пока root !=0

3. С предыдущей задачи — посчитать сумму data`s → int sum(Node root) //всех?
 */

public class Node {
    Node left;
    Node right;
    int data;

    public Node(Node left, Node right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum > rightSum ? leftSum + root.data + rightSum : rightSum + root.data + leftSum;
    }
}
