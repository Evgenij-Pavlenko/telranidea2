package tree;

/*
2. class Node{
Node left;
Node right;
int data; //данные — в данном случае для дерева int
} - таким образом можно записать любое дерево
Написать функцию int height(Node root)
*рекурсивно решается. Высота из родительской вершины равна максимуму высоты от дочерних элементов (левого и правого) +1
Двигаться вниз, пока root !=0
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return leftHeight>rightHeight? leftHeight+1:rightHeight+1;
//        return leftHeight<rightHeight? leftHeight+1:rightHeight+1;
        //уже не работает. Это надо смотреть - какая ветка дерева длинее...
    }
}
