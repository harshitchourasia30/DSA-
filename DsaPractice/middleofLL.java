// Given the head of a singly linked list, return the middle node of the linked list.

// If there are two middle nodes, return the second middle node.


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

METHOD 1:-

class Solution {
    public ListNode middleNode(ListNode head) {
        int length =0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }

        temp = head;   // we have to start from head again to reach the middle node.

     for(int i=1; i<=length/2; i++){
        temp = temp.next;
     }
        return temp; // we are not returning temp.val because we have to return the middle node not the value of middle node.
        
    }
}

method 2:- 

class Solution {
    public ListNode middleNode(ListNode head) {
    
    ListNode slow =head;
    ListNode fast =head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
}


 
