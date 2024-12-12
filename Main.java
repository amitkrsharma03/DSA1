package Programs;

public class Main {
    public static void main(String[] args) {
        // Create a sample linked list: [0,3,1,0,4,5,2,0]
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(0);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(2);
        ListNode node8 = new ListNode(0);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        Solution solution = new Solution();
        ListNode modifiedList = solution.mergeNodes(node1);

        // Print the modified linked list
        while (modifiedList != null) {
            System.out.print(modifiedList.val + " ");
            modifiedList = modifiedList.next;
        }
    }
}