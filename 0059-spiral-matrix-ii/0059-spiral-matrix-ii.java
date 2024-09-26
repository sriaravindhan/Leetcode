class Solution {
    public int[][] generateMatrix(int n) {
        int rowStart =0,rowEnd = n-1;
        int colStart =0,colEnd = n-1;
        int j=1;
        int[][] arr = new int[n][n];
        while(rowStart<=rowEnd && colStart <= colEnd){
            
            for(int i=colStart ; i <= colEnd;i++){
                arr[rowStart][i] = j++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                arr[i][colEnd] = j++;
            }
            colEnd--;
            
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    arr[rowEnd][i] = j++;
                }
                rowEnd--;
            }
            
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    arr[i][colStart] = j++;
                }
                colStart++;
            }
        }
        
        return arr;
        
    }
}