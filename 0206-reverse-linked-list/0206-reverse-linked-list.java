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
    public ListNode reverseList(ListNode head) {
        ListNode re = null;
        ListNode temp = head;
        while(temp!=null){
            ListNode s = temp.next;
            temp.next=re;
            re=temp;
            temp = s;
        }
        return re;
    }
}