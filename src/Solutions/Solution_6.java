package Solutions;

public class Solution_6 {
    public String convert(String s, int numRows) {
        if (s.equals("")) return "";
        if (numRows== 1) return s;

        int interval= 2* numRows- 2;
        int h_limit= s.length()/ interval+ ((s.length()% interval== 0) ? 0: 1);
        StringBuilder re= new StringBuilder();
        for (int row= 0; row< numRows; row++){
            for (int col= 0; col< h_limit; col++){
                int l= col* interval+ row;
                if (l< s.length()) re.append(s.charAt(l));
                int r= (col+ 1)* interval- row;
                if (r< s.length()&& l!= r&& row!= 0) re.append(s.charAt(r));
            }
        }
        return re.toString();
    }
}
