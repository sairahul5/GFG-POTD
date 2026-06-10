class Solution {
    static boolean search(int a[],int left,int right,int key){
        while(left<=right){
            int mid = left + (right-left)/2;
            if(a[mid]==key){
                return true;
            }else if(a[mid]<key){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
    public int binarySearchable(int[] a) {
        // code here
        int count=0;
        boolean x;
        for(int i=0;i<a.length;i++){
            x=search(a,0,a.length-1,a[i]);
            if(x==true) count++;
        }
        return count;
    }
};
