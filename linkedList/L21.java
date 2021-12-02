package linkedList;

/*
 * LeetCode Difficulty: Easy
 * My Judgement: Easy
 */
public class L21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode head, temp;
        if (l1.val > l2.val) {
            head = l2;
        } else {
            head = l1;
        }

        while(l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                temp = l2;
                l2 = l2.next;
                if (l2 == null || l1.val <= l2.val) {
                    temp.next = l1;
                }
            } else {
                temp = l1;
                l1 = l1.next;
                if (l1 == null || l2.val < l1.val) {
                    temp.next = l2;
                }
            }
        }

        return head;
    }

    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
