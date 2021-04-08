package Solutions;

import java.util.*;

public class Solution_42 {
    public int trap(int[] height){
        int[] left= new int[height.length];
        int max= 0;
        for (int i= 0; i< height.length; i++){
            max= Math.max(height[i],max);
            left[i]= max;
        }

        int[] right= new int[height.length];
        max= 0;
        for (int i=height.length-1; i>= 0; i--){
            max= Math.max(height[i],max);
            left[i]= max;
        }

        int result= 0;
        for (int i= 0; i< height.length; i++){
            result= result+ Math.min(left[i], right[i])- height[i];
        }
        return result;
    }
}
//class Solution {
//    HashMap<Integer,List<Integer>> adjlist;
//
//    public int findClosestLeaf(TreeNode root, int k) {
//        adjlist= new HashMap<>();
//        Queue<Integer> q= new LinkedList<>();
//        Set<Integer> seen= new HashSet<>();
//        adjList(root);
//        q.add(k);
//        while (!q.isEmpty()){
//            int current= q.poll();
//            seen.add(current);
//            if (adjlist.get(current).size()==1) return current;
//            for (int child: adjlist.get(current)){
//                if (!seen.contains(child)) q.add(child);
//            }
//        }
//    }
//
//    private void adjList(TreeNode root){
//        if (root!= null){
//            if(root.left!= null){
//                adjlist.computeIfAbsent(root.val, k-> new ArrayList<>()).add(root.left.val);
//                adjlist.computeIfAbsent(root.left.val, k-> new ArrayList<>()).add(root.val);
//                adjList(root.left);
//            }
//            if(root.right!= null){
//                adjlist.computeIfAbsent()
//                adjlist.computeIfAbsent(root.val, k-> new ArrayList<>()).add(root.right.val);
//                adjlist.computeIfAbsent(root.right.val, k-> new ArrayList<>()).add(root.val);
//                adjList(root.right);
//            }
//        }
//    }
//
//    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
//        //convert flights to adjacency list;
//        HashMap<Integer, LinkedList<int[]>> fchart= new HashMap<>();
//        for(int[] flight: flights){
//            int[] temp= new int[2];
//            temp[0]= flight[1];
//            temp[1]= flight[2];
//            fchart.computeIfAbsent(flight[0], k-> new LinkedList<int[]>()).add(temp);
//        }
//
//        //dijkstra
//        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>((a, b) -> a[1] - b[1]);
//        minHeap.offer(new int[]{src, 0, 0});
//
//        while(!minHeap.isEmpty()){
//            minHeap.poll();
//        }
//    }
//
//}

class LRUCache<K, V> extends LinkedHashMap<K, V>{
    private final int CACHE_SIZE;

    LRUCache(int cache_size) {
        super((int) Math.ceil(cache_size / 0.75) + 1, 0.75f, true);
        CACHE_SIZE = cache_size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.removeEldestEntry(eldest);
    }
}