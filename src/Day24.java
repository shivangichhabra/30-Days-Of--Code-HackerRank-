/*
Objective
Check out the Tutorial tab for learning materials and an instructional video!

Task
A Node class is provided for you in the editor. A Node object has an integer data field, , and a Node instance pointer, , pointing to another node (i.e.: the next node in a list).

A removeDuplicates function is declared in your editor, which takes a pointer to the  node of a linked list as a parameter. Complete removeDuplicates so that it deletes any duplicate nodes from the list and returns the head of the updated list.

Note: The  pointer may be null, indicating that the list is empty. Be sure to reset your  pointer when performing deletions to avoid breaking the list.

Input Format

You do not need to read any input from stdin. The following input is handled by the locked stub code and passed to the removeDuplicates function:
The first line contains an integer, , the number of nodes to be inserted.
The  subsequent lines each contain an integer describing the  value of a node being inserted at the list's tail.

Constraints

The data elements of the linked list argument will always be in non-decreasing order.
Output Format

Your removeDuplicates function should return the head of the updated linked list. The locked stub code in your editor will print the returned list to stdout.

Sample Input
6
1
2
2
3
3
4

Sample Output
1 2 3 4

 */

import java.util.Scanner;

class LLNode{
    int data;
    LLNode next;
    LLNode(int d){
        data=d;
        next=null;
    }
}

public class Day24 {

    public static LLNode removeDuplicates(LLNode head) {
        if(head == null)
        {
            System.out.println("Empty list");
            return head;
        }
        else
        {
            LLNode temp = head;
            while(temp.next != null)
            {
                if(temp.data == temp.next.data)
                {
                    temp.next= temp.next.next;
                }
                else
                {
                    temp = temp.next;
                }
            }
            return head;
        }


    }

    public static  LLNode insert(LLNode head,int data)
    {
        LLNode p=new LLNode(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            LLNode start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(LLNode head)
    {
        LLNode start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LLNode head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }
}

