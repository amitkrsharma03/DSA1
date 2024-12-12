package Programs;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
  public ListNode mergeNodes(ListNode head) {
      int sum=-0;
      ListNode lp=new ListNode();
      ListNode curr=lp;
      head=head.next;
      while(head!=null){
          if(head.val==0){
              curr.next=new ListNode(sum);
              curr=curr.next;
              sum=0;
          }else {
              sum+=head.val;
          }
          head=head.next;
      }
      if(sum>0){
          curr.next=new ListNode(sum);
      }
      return lp.next;
  }
}