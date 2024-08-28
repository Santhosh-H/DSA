/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //optimal code space O(1) time O(N)
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
}

//brute or better opproach time O(N) space O(N) by using stack ds
 // iterate the linkedlist through temp node and add all values to the
 // stack and the LIFO bases pop out the values and again re intialize temp as head
 // and put back the stack poped out values it will be in reverse order then return the head
 