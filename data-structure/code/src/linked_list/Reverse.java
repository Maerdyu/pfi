package linked_list;

public class Reverse {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode newHead = head, temp;
        while (head.next != null){
            temp = head.next;
            head.next = head.next.next;
            temp.next = newHead;
            newHead = temp;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        Reverse reverse = new Reverse();
        ListNode listNode = reverse.reverseList(n1);
        while (listNode != null){
            System.out.println(listNode.getVal());
            listNode = listNode.next;
        }
    }
}
