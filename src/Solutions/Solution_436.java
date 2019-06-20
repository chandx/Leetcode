package Solutions;
//binary search
//treemap

import java.util.Map;
import java.util.TreeMap;

public class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
 }
public class Solution_436 {
    public int[] findRightInterval(Interval[] intervals) {
        if (intervals.length== 1) return new int[]{-1};
        //TODO
        TreeMap<Integer, Integer> mp= new TreeMap<>();
        for (int i= 0; i< intervals.length; i++){
            mp.put(intervals[i].start, i);
        }
        int[] result= new int[intervals.length];
        for (int i= 0; i< intervals.length; i++){
            Map.Entry a= mp.ceilingEntry(intervals[i].end);
            if (a== null) result[i]= -1;
            else result[i]= (int)a.getValue();
        }
        return result;
    }
}
