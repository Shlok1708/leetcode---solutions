class Solution {
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node to act as the prev node for the first pair
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        while (current.next != null && current.next.next != null) {
            // Identify the two nodes to swap
            ListNode first = current.next;
            ListNode second = current.next.next;
            
            // Perform the swap
            first.next = second.next;
            second.next = first;
            current.next = second;
            
            // Move the pointer forward by two nodes for the next pair
            current = first;
        }
        
        return dummy.next;
    }
}