class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map=new HashSet<>();
        for(int k:nums1)
        {
            map.add(k);
        }
        HashSet<Integer> map1=new HashSet<>();
        for(int k:nums2)
        {
            if(map.contains(k))
            {
                map1.add(k);
            }
        }
        int  k[]=new int[map1.size()];
        int i=0;
        for(int x:map1)
        {
            k[i++]=x;
        }
        return k;
        
        
    }
}