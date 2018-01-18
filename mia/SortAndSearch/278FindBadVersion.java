public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n == 1) return 1;
        int start = 1;
        int end = n;
        while(start < end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)) end = mid;
            else start = mid + 1;
        }
        return end; //end always possibly contain the result
    }
}
