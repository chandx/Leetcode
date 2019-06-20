package Solutions;

public class Solution_29 {
    public int divide(int dividend, int divisor) {
        //TODO
        int re= 0;
        if (dividend>= 0 && divisor> 0){
            while (dividend>=0){
                dividend= dividend- divisor;
                re++;
            }
            re--;
        }
        else if (dividend>= 0 && divisor< 0){
            while (dividend>=0){
                dividend= dividend+ divisor;
                re--;
            }
            re++;
        }
        else if (dividend< 0 && divisor> 0){
            while (dividend<=0){
                dividend= dividend+ divisor;
                re--;
            }
            re++;
        }
        else{
            while (dividend<=0){
                if (dividend== Integer.MIN_VALUE && divisor== -1) return Integer.MAX_VALUE;
                dividend= dividend- divisor;
                re++;
            }
            re--;
        }
        return re;
    }
}
