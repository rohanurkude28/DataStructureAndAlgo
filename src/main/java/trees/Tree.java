package trees;

import java.util.HashMap;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) root = new TreeNode(value);
        else root.insert(value);
    }

    public void traverseInOrder() {
        if (root != null) root.traverseInOrder();
    }

    public TreeNode get(int value) {
        if (root != null) return root.get(value);
        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }

        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }
        else {
            // Cases 1 and 2: node to delete has 0 or 1 child(ren)
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            }
            else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }
        }

        return subtreeRoot;
    }

    public int min() {
        if (root == null) return Integer.MIN_VALUE;
        return root.min();
    }

    public int max() {
        if (root == null) return Integer.MAX_VALUE;
        return root.max();
    }

    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(16);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInOrder();
        System.out.println("");

        System.out.println(intTree.get(25));
        System.out.println(intTree.get(32));
        System.out.println(intTree.get(20));

        System.out.println(intTree.max());
        System.out.println(intTree.min());

        intTree.delete(15);
        intTree.traverseInOrder();
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
