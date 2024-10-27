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
        ListNode previous = null;
        ListNode present = head;
        try{
        ListNode next = present.next;
        while(present!=null){
            present.next=previous;
            previous=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        return head = previous;}
        catch(Exception e){
            return head;
        }
    }
}