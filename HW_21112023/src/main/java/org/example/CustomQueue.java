package org.example;

public class CustomQueue {

    private Node root; // Узел бинарного дерева

    private static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public CustomQueue() {
        this.root = null;
    }

    public void insert(int data) { // Добавляем элемент в дерево
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public int size() {
        return sizeHelper(root);
    }

    private int sizeHelper(Node node) {// метод для вычисления высоты дерева
        if (node == null) {
            return 0;
        }

        int leftSize = sizeHelper(node.left);
        int rightSize = sizeHelper(node.right);

        return Math.max(leftSize, rightSize) + 1;
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();

        queue.insert(5);
        queue.insert(3);
        queue.insert(8);
        queue.insert(2);
        queue.insert(4);
        queue.insert(7);
        queue.insert(9);

        System.out.println("Height of the tree: " + queue.size());
    }
}
