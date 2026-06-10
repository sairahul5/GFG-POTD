package GFG.2026.May;

public class Day001 {//Day001
    class Solution {
    
    static long attackCount(int n,int m){
        int a[] = {-2,-2,-1,-1,1,1,2,2};
        int b[] = {-1,1,-2,2,-2,2,-1,1};
        
        int attack = 0;
        
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                for(int k=0;k<8;k++) {
                    int nr=r+a[k];
                    int nc=c+b[k];
                    if(nr>=0 && nr<n && nc>=0 && nc<m) attack++;
                }
            }
        }
        
        return attack;
    }
    public long numOfWays(int n, int m) {
        long cells = 1L*n*m;
        long total = cells*(cells-1);
        return total-attackCount(n,m);
    }
}
}
