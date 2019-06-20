package Solutions;

import resource.ListNode;

public class Solution_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode re= new ListNode(0);
        ListNode tre= re;
        if(l1== null) return l2;
        if(l2== null) return l1;
        while(l1!= null&& l2!= null){
            if(l1.val< l2.val){
                tre.next= l1;
                l1= l1.next;
            }
            else{
                tre.next= l2;
                l2= l2.next;
            }
            tre= tre.next;
        }
        if(l1== null){
            while(l2!= null){
                tre.next= l2;
                l2= l2.next;
                tre= tre.next;
            }
        }
        else{
            while(l1!= null){
                tre.next= l1;
                l1= l1.next;
                tre= tre.next;
            }
        }
        return re.next;
    }
}
