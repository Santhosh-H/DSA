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
    public ListNode middleNode(ListNode head) {
        ListNode p1 =new ListNode();
        ListNode p2 =new ListNode();
        p1=head;
        p2=head;
        while(p2!=null && p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        return p1;
    }
}
// Initialize both pointers to the head of the list
        // ListNode p1 = head;
        // ListNode p2 = head;
        
        // // Traverse the list, p2 moves twice as fast as p1
        // while (p2 != null && p2.next != null) {
        //     p1 = p1.next;          // Move p1 one step
        //     p2 = p2.next.next;     // Move p2 two steps
        // }
        
        // // When p2 reaches the end, p1 will be at the middle
        // return p1;