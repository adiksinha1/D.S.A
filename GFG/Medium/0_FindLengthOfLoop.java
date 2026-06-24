/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-length-of-loop/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        Node slow=head;
        Node fast=head;
        int count;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
        
        if(slow==fast)
        {
            Node temp;
             count=1;
            temp=slow.next;
            while(temp!=slow)
            {
                temp=temp.next;
                count++;
            }
            
            return count;
        }
        }
        // code here
        return 0;
    }
}
