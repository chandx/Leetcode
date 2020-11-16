package Solutions;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Solution_22 {
    public List<String> generateParenthesis(int n) {
        Queue<String> re= new LinkedList<>();
        Queue<Integer> r1= new LinkedList<>();
        re.add("(");
        r1.add(1);
        re.add("()");
        r1.add(0);
        for (int i= 2; i<= n; i++){
            int sz= re.size();
            for (int x= 0; x< sz; x++){
                String temp1= re.poll()+ '(';
                int temp2=r1.poll()+1;
                re.add(temp1);
                r1.add(temp2);
                for (int q= 1; q<= temp2; q++){
                    temp1= temp1+ ')';
                    re.add(temp1);
                    r1.add(temp2-q);
                }
            }
        }

        int sz= re.size();
        for (int x= 0; x< sz; x++){
            String temp1= re.poll();
            int temp2=r1.poll();
            for (int q= 1; q<= temp2; q++){
                temp1= temp1+ ')';
            }
            re.add(temp1);
        }

        return re.stream().distinct().collect(Collectors.toList());
    }
}
