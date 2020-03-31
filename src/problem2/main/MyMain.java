/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void preorder(TreeNode root){
        if(root == null)    return;
        else{
            System.out.print(root.getData()+"\t");
            preorder(root.getLeft());
            preorder(root.getRight());

        }
    }

    public static void postorder(TreeNode root){
        if(root == null)    return;
        else{
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.print(root.getData()+"\t");
        }
    }

    public static void prepost(){
        MyBinarySearchTree obj = new MyBinarySearchTree();
        postorder(obj.getRoot());
        System.out.println();
        preorder(obj.getRoot());
    }
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(85);
        obj.insert(63);
        obj.insert(54);
        obj.insert(2);
        obj.insert(23);
        obj.insert(95);
        obj.insert(36);
        prepost();
    }
}
