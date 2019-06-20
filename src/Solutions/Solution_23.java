package Solutions;

import resource.ListNode;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists== null|| lists.length == 0) return null;
        SortValue comparator= new SortValue();
        PriorityQueue<ListNode> sorter= new PriorityQueue<>(comparator);
        ListNode re= new ListNode(0);
        ListNode ite= re;
        for (ListNode list: lists){
            try{ sorter.add(list); }
            catch (NullPointerException e) { e.printStackTrace(); }
        }
        while (!sorter.isEmpty()){
            ListNode current= sorter.poll();
            ite.next= current;
            ite= ite.next;
            if (current.next!= null) sorter.add(current.next);
        }
        return re.next;
    }

    class SortValue implements Comparator<ListNode>{
        public int compare(ListNode a, ListNode b){ return a.val-b.val; }
    }
}
