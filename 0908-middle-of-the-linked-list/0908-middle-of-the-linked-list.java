/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * } otherwise 
  ListNode iterator = head;
        int count = 0;
        
        while(iterator!=null){
            count++;
            iterator=iterator.next;
        }

        int middleIndex = count/2;
        ListNode result = head;

        while(middleIndex!=0){
            result = result.next;
            middleIndex--;
        }
        return result;
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(head == null) return head;
        while(fast.next!=null && fast.next.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next==null) return slow;
        else return slow.next;
    }
}