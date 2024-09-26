class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        int i=0;
        while(i<nums.length){
            if(nums[i]==target){
                arr[0]=i;
                arr[1]=i;
                break;
            }
            i++;
        }
        int j=nums.length-1;
        while(j>i){
            if(nums[j]==target) 
            {
                arr[1]=j;
                break;
            }
            j--;
        }
        return arr;
    }
}