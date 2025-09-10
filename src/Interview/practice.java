package Interview;


import java.util.*;
class Node {
    int val;
    Node left, right;
    Node(int val) { this.val = val; }
}
public class practice {
    public static boolean isValidBST(Node root) {
        return validate(root, null, null);
    }

    private static boolean validate(Node node, Integer min, Integer max) {
        if (node == null) return true;
        if ((min != null && node.val <= min) || (max != null && node.val >= max))
            return false;

        return validate(node.left, min, node.val) &&
                validate(node.right, node.val, max);
    }

    // Example test
    public static void main(String[] args) {
        /*
               5
              / \
             3   7
            / \   \
           2   4   8
        */
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(8);

        System.out.println(isValidBST(root)); // true
    }

}
