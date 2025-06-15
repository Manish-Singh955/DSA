class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
          List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0)
            return result;
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length;
        int endCol=matrix[0].length;
        while(startRow<endRow && startCol<endCol){
            for(int j=startCol;j<endCol;j++){
               result.add(matrix[startRow][j]);
            }
              for(int i=startRow+1;i<endRow;i++){
                result.add(matrix[i][endCol-1]);
            }
                if (startRow < endRow - 1) {
                for (int j = endCol - 2; j >= startCol; j--) {
                    result.add(matrix[endRow - 1][j]);
                }
            }
          if (startCol < endCol - 1) {
                for (int i = endRow - 2; i > startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
            }
        startRow++;
        startCol++;
        endRow--;
        endCol--;
        
        }
        return result;
    }
}
