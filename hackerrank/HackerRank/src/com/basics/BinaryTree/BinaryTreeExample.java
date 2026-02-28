package com.basics.BinaryTree;

public class BinaryTreeExample {

    public static void inorder(Node root){
        if (root == null)
            return;
         inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void preorder(Node root){
        if (root == null)
            return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root){
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right= new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Inorder traversal");
        inorder(root);
        System.out.println("Pre order traversal");
        preorder(root);
        System.out.println("Post order tranversal");
        postorder(root);

    }
}
