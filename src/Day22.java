/*
Objective
Today, we're working with Binary Search Trees (BSTs). Check out the Tutorial tab for learning materials and an instructional video!

Task
The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. You are given a pointer, , pointing to the root of a binary search tree. Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.

Input Format

The locked stub code in your editor reads the following inputs and assembles them into a binary search tree:
The first line contains an integer, , denoting the number of nodes in the tree.
Each of the  subsequent lines contains an integer, , denoting the value of an element that must be added to the BST.

Output Format

The locked stub code in your editor will print the integer returned by your getHeight function denoting the height of the BST.

Sample Input
7
3
5
2
1
4
6
7

Sample Output
3
 */

import java.util.Scanner;

class BSTNode{
    BSTNode left,right;
    int data;
    BSTNode(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day22 {
    public static int getHeight(BSTNode root)
    {
        if(root == null)
        {
            return 0;
        }
        else if (root.left == null && root.right == null )
        {
            return 0;
        }
        else
        {
            int lheight = getHeight(root.left);
            int rheight = getHeight(root.right);

            if(lheight > rheight)
            {
                return lheight+1;
            }
            else
            {
                return rheight+1;
            }
        }
    }

    public static BSTNode insert(BSTNode root,int data){
        if(root==null){
            return new BSTNode(data);
        }
        else{
            BSTNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        BSTNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
