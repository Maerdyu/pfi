package linked_list;

public class Palindrome {

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

    public boolean isPalindrome(ListNode head) {

        ListNode i = head, j = head, start = head;
        while (j != null && j.next != null) {
            i = i.next;
            j = j.next.next;
        }

        ListNode reverse = reverse(i);

        while (reverse != null){
            if(start.val != reverse.val){
                return false;
            }
            start = start.next;
            reverse = reverse.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        if(head == null) {
            return null;
        }
        
        ListNode newHead = head, temp;
        while (head.next!= null){
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
        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(4, n2);
        ListNode n0 = new ListNode(5, n1);

        Palindrome palindrome = new Palindrome();
        boolean p =  palindrome.isPalindrome(n1);
        System.out.println(p);
    }
}
