class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        if (nums.length < 4) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        
        Arrays.sort(nums);
        int size = nums.length;

        
        for (int i = 0; i < size; i++) {
            
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            
            for (int j = i + 1; j < size; j++) {
                
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                
                int k = j + 1;
                int l = size - 1;

                
                while (k < l) {
                    
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum == target) {
                        
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;

                        
                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }

        }

        return result;
    }
}