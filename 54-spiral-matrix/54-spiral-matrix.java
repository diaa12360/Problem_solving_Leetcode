class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix[0].length, m = matrix.length, t = n * m, count = 0;
        int firstRow = 0, firstColmn = 0;
        List<Integer> list = new ArrayList<Integer>();
        while(true){
            for(int i = firstColmn; i < n; i++){
                list.add(matrix[firstRow][i]);
            }
            count += (n - firstColmn);
            if(count >= t)
                break;
            else
                firstRow++;
            //
            for(int i = firstRow; i < m; i++){
                list.add(matrix[i][n-1]);
            }
            count += (m - firstRow);
            if(count >= t)
                break;
            else 
                n--;                    
            
            for(int i = n-1; i >= firstColmn; i--){
                list.add(matrix[m-1][i]);
            }
            count += (n - firstColmn);
            if(count >= t)
                break;
            else
                m--;
            
            for(int i = m-1; i >= firstRow; i--)
                list.add(matrix[i][firstColmn]);
            count += (m - firstRow);
            if(count >= t)
                break;
            else
                firstColmn++;
        
        }
        return list;
    }
}