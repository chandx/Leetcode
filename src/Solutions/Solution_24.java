package Solutions;

import resource.ListNode;

public class Solution_24 {
    public ListNode swapPairs(ListNode head) {
        if (head==null) return null;
        if (head.next==null) return head;
        ListNode re= new ListNode(0);
        re.next=head;
        ListNode n0= re;
        while (n0.next!= null && n0.next.next!= null){
            ListNode n1= n0.next;
            ListNode n2= n1.next;
            n0.next=n2;
            n1.next=n2.next;
            n2.next=n1;
            n0=n0.next.next;
        }
        return re.next;
    }
}
