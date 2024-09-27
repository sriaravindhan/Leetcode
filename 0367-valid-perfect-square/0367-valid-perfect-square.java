class Solution {
    public boolean isPerfectSquare(int n) {
        long start=0;
        long end=1000000001;
        while(start<=end){
            long mid=start+(end-start)/2;
            long temp=mid*mid;
            if(temp==n)return true;
            if(temp<n)start=mid+1;
            else end=mid-1;
        }
        return false;
        
    }
}