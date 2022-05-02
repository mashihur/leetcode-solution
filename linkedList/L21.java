package linkedList;

/*
 * Company: Amazon, Microsoft
 * LeetCode Difficulty: Easy
 * My Judgement: Medium
 */
public class L21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { // Simple solution
        ListNode node = new ListNode(0);
        ListNode head = node;
        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        if (list1 == null) {
            node.next = list2;
        } else {
            node.next = list1;
        }

        return head.next;
    }

//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) { // Faster but difficult solution
//        if (l1 == null) {
//            return l2;
//        } else if (l2 == null) {
//            return l1;
//        }
//
//        ListNode head, temp;
//        if (l1.val > l2.val) {
//            head = l2;
//        } else {
//            head = l1;
//        }
//
//        while(l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                temp = l1;
//                l1 = l1.next;
//                if (l1 == null || l2.val < l1.val) {
//                    temp.next = l2;
//                }
//            } else {
//                temp = l2;
//                l2 = l2.next;
//                if (l2 == null || l1.val <= l2.val) {
//                    temp.next = l1;
//                }
//            }
//        }
//
//        return head;
//    }

}
