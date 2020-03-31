/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;

    private int size;

    public TreeNode getRoot()
    {
        return root;
    }

    public void insert(int data)
    {
        TreeNode node = new TreeNode(data);
        if(root == null)
        {
            root = node;
            size++;
            System.out.println("Inserted successfully at root.");
        }
        else
        {
            TreeNode temp = root;
            TreeNode parent = null;
            while(temp != null)
            {
                parent = temp;
                if(node.getData() <= temp.getData())
                {
                    temp = temp.getLeft();
                }
                else
                {
                    temp = temp.getRight();
                }
            }
            if(node.getData() <= parent.getData())
            {
                parent.setLeft(node);
                size++;
                System.out.println("Insert Suc at left");
            }
            else
            {
                parent.setRight(node);
                size++;
                System.out.println("Insert suc at right");
            }
        }
    }

    public boolean search(int data) {
        boolean response = false;
        TreeNode temp = root;
        while (temp != null) {
            if (temp.getData() == data) {
                response = true;
                break;
            } else {
                if (data <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
        }
        return response;
    }

    public int height(TreeNode node){
        int height=-1;
        if(node==null){
            return height;
        }
        else {
            return 1+Math.max(height(node.getLeft()),height(node.getRight()));
        }
    }

    public void traverseLevelOrder(TreeNode node){
        int count=0;
        if(node==null){

        }
        else{
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(node);
            System.out.print("Left Nodes data: ");
            while( !(queue.isEmpty())){
                TreeNode currentNode=queue.remove();
                if(currentNode.getLeft()==null){
                    count++;
                }
                else if(currentNode.getLeft()!=null){
                    System.out.print(currentNode.getLeft().getData()+" ");
                    queue.add(currentNode.getLeft());
                }
                if(currentNode.getRight()!=null){
                    queue.add(currentNode.getRight());
                }
            }
        }
        System.out.println();
        System.out.println("Number of nodes who doesn't have left node: "+count);
    }
}
