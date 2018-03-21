package Solutions;

public class Solution_278 {
    private int _firstBad;
    public Solution_278(int firstBad){
        _firstBad= firstBad;
    }
    private boolean isBadVersion(int version){
        if (version>= _firstBad) return true;
        else return false;
    }

//Submission
    public int firstBadVersion(int n) {
        if(isBadVersion(1)) return 1;
        return recursiveFind(1, n);
    }
    private int recursiveFind(int start, int end){
        int mid= start+ (end- start)/2;
        if(start== mid) return isBadVersion(start)? start: end;
        if (isBadVersion(mid)) return recursiveFind(start, mid);
        else return recursiveFind(mid, end);
    }
}
