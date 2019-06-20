package Solutions;

import resource.ListNode;

public class Solution_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode r= new ListNode(0);
        r.next= head;
        ListNode q= r;
        for(int i= 0; i< n; i++){
            q= q.next;
        }
        ListNode p= r;
        while(q.next!= null){
            p= p.next;
            q= q.next;
        }
        p.next= p.next.next;
        return r.next;
    }
}
