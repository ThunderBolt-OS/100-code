package Trees.BinaryTree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

//    building a tree from its preorder traversals
    static class BinaryTree{
//        a reference variable
        static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;
//            if nodes are empty
            if (nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
//            here we are building left side of the tree
            newNode.left = buildTree(nodes);
//            here we are building right side of the tree
            newNode.right = buildTree(nodes);

            return newNode;

        }

    }

//    LEVEL ORDER
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                //queue empty
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }


    //    PREORDER Traversals
//    ROOT
//    LEFT
//    RIGHT
    public static void preorder(Node root){
        if(root == null){
            System.out.println(-1 + " ");
            return;
        }
        System.out.println(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

//    INORDER Traversals
//    LEFT CHILD
//    ROOT
//    RIGHT CHILD
    public static void inorder(Node root){
        if(root == null){
            System.out.println(-1+ " ");
            return;
        }
        inorder(root.left);
        System.out.println(root.data+ " ");
        inorder(root.right);
    }

//    POSTORDER Traversals
//    LEFT CHILD
//    RIGHT CHILD
//    ROOT

    public static void postorder(Node root){
        if(root == null){
            System.out.println(-1+ " ");
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data+ " ");
    }

//    HEIGHT OF A TREE
//    Time Complexity is O(N)
//    Space Complexity is O(N) {due to recursive calls}
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

//    COUNT NODES OF TREE
//    Time Complexity is O(N)
//    Space Complexity is O(N) {due to recursive calls}
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = countNode(root.left);
        int rightHeight = countNode(root.right);
        return leftHeight + rightHeight + 1;
    }

//    SUM OF NODES OF THE TREE
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = sumOfNodes(root.left);
        int rightHeight = sumOfNodes(root.right);
        return leftHeight + rightHeight + root.data;
    }

//    DIAMETER OF TREE
//    Approach 1. ie O(N^2) Time complexity
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = height(root.left) + height(root.right) + 1;
        int diam2 = diameter(root.left);
        int diam3 = diameter(root.right);

        return Math.max(diam1, Math.max(diam2, diam3));
    }

//    public static TreeInfo diameter(Node root) {
//        if(root == null) {
//            return new TreeInfo(0, 0);
//        }
//
//        TreeInfo leftTI = diameter(root.left);
//        TreeInfo rightTI = diameter(root.right);
//
//        int myHeight = Math.max(leftTI.height, rightTI.height) + 1;
//
//        int diam1 = leftTI.height + rightTI.height + 1;
//        int diam2 = leftTI.diam;
//        int diam3 = rightTI.diam;
//
//        int myDiam = Math.max(diam1, Math.max(diam2, diam3));
//
//        return new TreeInfo(myHeight, myDiam);
//    }

//    public boolean isIdentical(TreeNode root,TreeNode subRoot){
//        if(subRoot == null && root == null){
//            return true;
//        }
//        if(root == null || subRoot == null){
//            return false;
//        }
//        if(root == subRoot.val){
//            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
//        }
//        return false;
//    }
//
//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        if(subRoot == null){
//            return true;
//        }
//        if(root == null){
//            return false;
//        }
//        if(isIdentical(root, subRoot)){
//            return true;
//        }
//        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//    }




    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root.data);

    }

}
