class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        
        // Create a copy of the original score array
        int[] sortedScores = score.clone();
        
        // Sort the copied array in descending order
        Arrays.sort(sortedScores);
        
        // Use a HashMap to store the scores with their ranks
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            rankMap.put(sortedScores[n - 1 - i], i + 1);  // Rank starting from 1
        }
        
        // Prepare the result array
        String[] result = new String[n];
        
        // Assign ranks based on the score
        for (int i = 0; i < n; i++) {
            int rank = rankMap.get(score[i]);
            if (rank == 1) {
                result[i] = "Gold Medal";
            } else if (rank == 2) {
                result[i] = "Silver Medal";
            } else if (rank == 3) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(rank);
            }
        }
        
        return result;
    }
}