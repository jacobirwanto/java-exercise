package com.adepuu.exercises.session11;

import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertNode(root, data);
    }

    private TreeNode insertNode(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    public boolean search(int data) {
        return searchNode(root, data);
    }

    private boolean searchNode(TreeNode root, int data) {
        if (root == null) {
            return false;
        }
        if (data == root.data) {
            return true;
        }
        if (data < root.data) {
            return searchNode(root.left, data);
        }
        return searchNode(root.right, data);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        System.out.print("Enter the number of elements to insert into the BST: ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            bst.insert(num);
        }

        while (true) {
            System.out.print("Enter a number to search for (-1 to exit): ");
            int searchNum = scanner.nextInt();
            if (searchNum == -1) {
                System.out.println("Exiting...");
                break;
            }

            boolean found = bst.search(searchNum);
            if (found) {
                System.out.println("Number " + searchNum + " found in the BST.");
            } else {
                System.out.println("Number " + searchNum + " not found in the BST.");
            }
        }

        scanner.close();
    }
}
