//Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.


class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode i = head;

        while(i != null){
            if(i.next == null || i.val != i.next.val){
                t.next = i;
                t = i;
                i = i.next;
            }
             else{ //i.val == i.next.val
            ListNode j = i.next;
            while(j != null && j.val == i.val){
                j=j.next;
            }
            i=j;
        }  
        
    }
    t.next = i;
        return dummy.next;
}
} 
 