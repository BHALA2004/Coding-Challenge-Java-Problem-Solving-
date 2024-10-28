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
    public  int size(ListNode head){
        ListNode temp = head;int count = 0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
         if (head == null || head.next == null) {
            // No rotation needed for an empty or single-element list
            return head;
        }
        for(int i = 0;i<k%size(head);i++){
        ListNode temp = head;
        // Traverse to the second-to-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Now temp is the second-to-last node
        ListNode lastNode = temp.next;
        temp.next = null;  // Disconnect the last node

        // Move last node to the head
        lastNode.next = head;
        head = lastNode;}
        return head;

    }
    }