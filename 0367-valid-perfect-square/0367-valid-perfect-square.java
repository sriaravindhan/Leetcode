class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1 || num== 4 ) return true;
        if(num%10 == 2 || num%10 == 7 || num%10 == 3) return false;
        for(int i=2;i<num/2;i++){
            if(i*i==num) return true;
        }
        return false;
    }
}