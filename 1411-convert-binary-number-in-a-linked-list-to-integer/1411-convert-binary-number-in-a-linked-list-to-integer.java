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
    public int getDecimalValue(ListNode head) {
        String s = new String();
        ListNode temp = head;
        while(temp!=null){
            s+=String.valueOf(temp.val);
            temp=temp.next;
        }
        int a =  Integer.parseInt(s,2);
        return a;
    }
}