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
    public void reorderList(ListNode head) {

        ListNode mid=findmid(head);
        ListNode reverse=reversell(mid.next);
        mid.next=null;

        merge(head,reverse);

        /** find middlse slow fast approach
        reverse the mid to last ll
        merge both ll alternatively
         */
        
    }
     public ListNode findmid(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

        
    }
     public ListNode reversell(ListNode head) {

        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null){
            ListNode next=curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;

        
    }
     public void merge(ListNode head1,ListNode head2) {

        ListNode first=head1;
        ListNode second=head2;
       

     
         while(second!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;


        }




    }


}