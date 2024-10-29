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
    public int max(ArrayList<Integer> list){
        int m = Integer.MIN_VALUE;int max = 0;
        for(int i : list){
            m=Math.max(m,i);
        }
        return m;
}
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode present = head;
        ListNode future = head.next;
        while (present!=null){
            present.next=prev;
            prev=present;
            present=future;
            if(future!=null){
                future=future.next;
            }

        }
        return head=prev;
    }
    public  int size(ListNode head){
        ListNode temp = head;int count = 0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
     public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = size(head)/2;
        ListNode temp = head;
        for(int i = 1;i<m;i++){
            temp=temp.next;
        }
        ListNode head1 = temp.next;
        temp.next=null;
        //display(head);
       // System.out.println("Node 2");
        //display(head1);
        ListNode heads = reverse(head1);
        //System.out.println("reverse");
        //display(heads);
        while (head!=null && heads!=null){
            int sum = head.val+heads.val;
            list.add(sum);
            head=head.next;
            heads=heads.next;
        }
        //System.out.println(list);
        return max(list);
    }
}