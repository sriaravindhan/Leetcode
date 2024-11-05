class Solution {
    public static void dfs(int node,List<List<Integer>> adj,int vis[]){
        vis[node]=1;
        for(int a:adj.get(node)){
            if(vis[a]==0){
                dfs(a,adj,vis);
            }
        }
    }
    public int findCircleNum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<m;i++){
            adj.add(new ArrayList<>());
        } 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int count=0;
        int vis[] = new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0) {
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }
}