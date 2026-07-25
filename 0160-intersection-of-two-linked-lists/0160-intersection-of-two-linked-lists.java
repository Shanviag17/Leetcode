/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getListLength(ListNode head){
        int count=0;
        while(head != null){
            count++;
            head=head.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=getListLength(headA);
        int lenB=getListLength(headB);
        while(lenA>lenB){
            lenA--;
            headA=headA.next;
        }
        while(lenB>lenA){
            lenB--;
            headB=headB.next;
        }
        while(headB != headA){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna