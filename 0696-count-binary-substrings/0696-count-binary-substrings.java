class Solution {
    public int countBinarySubstrings(String s) {
        int[] groups = new int[s.length()];
        int groupIndex = 0;
        groups[0] = 1;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(i - 1)) groups[++groupIndex] = 1;
            else groups[groupIndex]++;
        }

        int result = 0;
        for(int i = 1; i <= groupIndex; i++) {
            result += Math.min(groups[i], groups[i - 1]);
        }

        return result;
    }
}