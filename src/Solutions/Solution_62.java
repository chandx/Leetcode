package Solutions;

public class Solution_62 {
    //TODO to finish the situation of overflow and mismatch
    public int uniquePaths(int m, int n) {
        int larger= 0;
        int smaller= 0;
        if (m> n){
            larger= m;
            smaller= n;
        }
        else {
            larger= n;
            smaller= m;
        }
        int upper= 1;
        for (int i= larger+1; i> smaller; i--) upper = upper * i;

        int lower= 1;
        for (int i= 1; i< larger- smaller; i++) {
            lower = lower * i;
        }
        return upper/(lower* 2);
    }
}
