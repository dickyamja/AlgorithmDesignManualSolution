package solution.chapter1.leetcode;

/**
 * https://leetcode.com/problems/rotate-list/
 * @author ahmadamal
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tempHead = head;
        while( k>0 ){

            ListNode nextNode = head.next;
            while (head.next != null){
                ListNode tempCurrentNode = head;
                head.next = head;
                nextNode.next = tempCurrentNode;

            }
            k--;
        }
        return tempHead;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
