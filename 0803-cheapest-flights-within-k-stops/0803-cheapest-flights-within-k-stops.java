class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int cost[]= new int [n];
        int tempcost[]= new int[n];
        for(int i=0;i<n;i++) {
            cost[i]=Integer.MAX_VALUE;
            tempcost[i]=Integer.MAX_VALUE;
        }
        //5,6,1
        cost[src]=0;
        tempcost[src]=0;
        for(int j=0;j<=k;j++){
            for(int i=0;i<flights.length;i++){
                int sr=flights[i][0];
                int ds=flights[i][1];
                if(cost[sr]!=Integer.MAX_VALUE){
                    int d=cost[sr]+flights[i][2];
                    if(d<tempcost[ds]) tempcost[ds]=d;
                }
            }
            for(int i=0;i<n;i++) {
                cost[i]=tempcost[i];
                // System.out.print(cost[i]+" ");
            }
            // System.out.println();
        }
        if(cost[dst]==Integer.MAX_VALUE) return -1;
        return cost[dst];
    }
}