class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        int rowStart = 0, rowEnd = m.length - 1;
        int colStart = 0, colEnd = m[0].length - 1;
        List<Integer> lst = new ArrayList<>();
        
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                lst.add(m[rowStart][i]);
            }
            rowStart++;
            
            for (int i = rowStart; i <= rowEnd; i++) {
                lst.add(m[i][colEnd]);
            }
            colEnd--;
            
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    lst.add(m[rowEnd][i]);
                }
                rowEnd--;
            }
            
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    lst.add(m[i][colStart]);
                }
                colStart++;
            }
        }
        
        return lst;
    }
}
