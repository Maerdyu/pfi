package linked_list;

public class MergeTwoList {

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
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode(-1);

        ListNode tmp = listNode;
        while (list1 != null && list2 != null){
            if(list1.val > list2.val){
                tmp.next = list2;
                list2 = list2.next;
            }else {
                tmp.next = list1;
                list1 = list1.next;
            }
            tmp = tmp.next;
        }

        tmp.next= list1 == null ? list2 : list1;

        return listNode.next;
    }
}
