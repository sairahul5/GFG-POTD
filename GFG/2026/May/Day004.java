class Solution {
    public int findIndex(String s) {
        int n=s.length();
        
        int[] open = new int[n];
        int[] close =new int[n];
        
        open[0]=(s.charAt(0)=='(') ? 1 : 0;
        close[n-1]=(s.charAt(n-1)==')') ? 1 : 0;
        for(int i=1;i<n;i++){
            open[i]=open[i-1]+(s.charAt(i)=='(' ? 1: 0);
        }
        for(int i=n-2;i>=0;i--){
            close[i]=close[i+1]+(s.charAt(i)==')' ? 1: 0);
        }
        for(int i=0;i<n;i++){
            if(i-1>=0){
                if(open[i-1]==close[i]){
                    return i;
                }
            }
        }
        if(close[0]==0){
            return 0;
        }
        if(open[n-1]==0){
            return n;
        }
        return n;
    }
}
