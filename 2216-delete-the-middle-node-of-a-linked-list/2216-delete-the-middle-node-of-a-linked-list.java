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
    public ListNode deleteMiddle(ListNode head) {
        int m = size(head)/2;
        if(size(head)==1){
            return head = null;
        }
        ListNode temp = head;
        for(int i = 1;i<m;i++){
            temp=temp.next;
        }
        try{
        temp.next=temp.next.next;}
        catch(Exception e){
    }
    return head;
    }
}