class Solution {
    public int [] searchRange(int [] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int [] {-1, -1};
        }

        int x = search(nums, 0, nums.length - 1, target);

        if (x == -1) {
            return new int [] {-1, -1};
        }

        int t = x;
        int l = -1;

        while (t != -1) {
            l = t;
            t = search(nums, 0, t - 1, target);
        }

        t = x;
        int r = -1;

        while (t != -1) {
            r = t;
            t = search(nums, t + 1, nums.length - 1, target);
        }

        return new int [] {l, r};
    }

    private int search(int [] nums, int l, int r, int target) {
        if (l < 0 || r > nums.length - 1 || l > r || target < nums[l] || nums[r] < target) {
            return -1;
        }

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                return m;
            }

            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }
}