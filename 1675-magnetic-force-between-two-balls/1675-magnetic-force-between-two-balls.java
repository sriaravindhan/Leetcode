class Solution {
    public int maxDistance(int[] pos, int m) {
        Arrays.sort(pos);
        int left =1,right = (pos[pos.length-1]-pos[0])/(m-1);
        while(left<=right){
            int mid = (left+right)/2;
            if(canplaceBalls(pos,mid,m)) left = mid+1;
            else right = mid -1;
            System.out.println(left +" "+right);
        }
        return right;
    }
    private static boolean canplaceBalls(int[] pos , int mid , int m){
        int count =1;
        int lastPosition =pos[0];
        for(int i=1;i<pos.length;i++){
            if(pos[i]-lastPosition >=mid){
                count++;
                lastPosition = pos[i];
                if(count == m) return true;
            }
        }
        return false;
    }
}