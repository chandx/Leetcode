package Solutions;

import resource.ListNode;

public class Solution_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null) return null;
        if (head.next==null) return head;
        if (k== 1) return head;
        ListNode re= new ListNode(0);
        re.next=head;
        ListNode ite= re;
        ListNode[] line= new ListNode[k+1];

        while (true){
            for (int i= 0; i<= k; i++){
                if (ite== null) return re.next;
                line[i]= ite;
                ite= ite.next;
            }
            line[0].next=line[k];
            line[1].next= line[k].next;
            for (int i= 2; i<= k; i++) line[i].next= line[i-1];
            ite= line[1];
        }
    }
}
