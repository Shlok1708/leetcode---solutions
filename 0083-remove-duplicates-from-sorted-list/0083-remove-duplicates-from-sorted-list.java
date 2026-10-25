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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        
        ListNode current = head;
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Agar current aur agla node same hain, toh agle wale ko skip kar do
                current.next = current.next.next;
            } else {
                // Agar alag hain, toh aage badh jao
                current = current.next;
            }
        }
        
        return head;
    }
}