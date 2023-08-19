package linked_list;

/**
 * 相交链表
 */
public class Intersection {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public int getVal() {
            return val;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 如果heaA 或者 headB为空,返回null
        if (headA == null || headB == null) {
            return null;
        }

        int count = 0;
        ListNode a = headA, b = headB;
        while (a != b) {
            if (count == 3) {
                return null;
            }

            a = a.next;
            b = b.next;
            if (a == null) {
                a = headB;
                count++;
            }
            if (b == null) {
                b = headA;
                count++;
            }
        }

        return a;
    }


    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        listNode2.next = listNode1;

        ListNode intersectionNode = intersection.getIntersectionNode(listNode1, listNode2);
        System.out.println(intersectionNode.getVal());
    }
}
