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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ReturnNode=new ListNode(Integer.MIN_VALUE);
        ListNode headNode=ReturnNode;
        while(list1 != null && list2 != null){
            if(list1.val<=list2.val){
                ReturnNode.next=list1;
                list1=list1.next;
            }else{
                ReturnNode.next=list2;
                list2=list2.next;
            }
            ReturnNode=ReturnNode.next;
        }
        if(list1 == null){
            ReturnNode.next=list2;
        }else if(list2 == null){
            ReturnNode.next=list1;
        }
        return headNode.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna