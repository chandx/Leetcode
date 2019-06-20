package Solutions;

import java.util.*;

public class Solution_399 {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        HashMap<String, HashMap<String, Double>> map= new HashMap<>();
        double[] result= new double[queries.length];

        //To form the  bi direct graph
        for (int i= 0; i< equations.length; i++){
            String[] temp= equations[i];
            double rel= values[i];
            if (!map.containsKey(temp[1])) map.put(temp[1],new HashMap<>());
            map.get(temp[1]).put(temp[0],rel);
            if (!map.containsKey(temp[0])) map.put(temp[0], new HashMap<>());
            map.get(temp[0]).put(temp[1], 1/rel);
        }

        //To Search the graph use DFS
        for (int i= 0; i< queries.length; i++){
            String[] functinoNow= queries[i];
            //first check if there is illegal letter
            if (map.containsKey(functinoNow[0])&& map.containsKey(functinoNow[1])){
                //DFS, using multiplication, from f[1] to f[0]
                String start= functinoNow[1];
                String end= functinoNow[0];
                Stack<String> s= new Stack<>();
                Set<String> explored= new HashSet<>();
                s.add(start);
                while (!s.isEmpty()){
                    String now= s.pop();
                    if (!explored.contains(now)){
                        explored.add(now);

                    }
                }

            }
            else {
                result[i]= -1.0;
            }
        }
        return result;
    }
}
