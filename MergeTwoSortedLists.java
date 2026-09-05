public class MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    private static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
\
        ListNode list1 = createList(new int[]{1, 2, 4});
        ListNode list2 = createList(new int[]{1, 3, 4});

        System.out.print("List 1: ");
        printList(list1);

        System.out.print("List 2: ");
        printList(list2);

        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        System.out.print("Merged List: ");
        printList(mergedList);
    }
}