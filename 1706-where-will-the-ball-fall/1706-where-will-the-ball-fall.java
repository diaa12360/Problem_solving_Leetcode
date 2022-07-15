class Solution {
    public int[] findBall(int[][] grid) {
        int[] arr = new int[grid[0].length];
        Arrays.fill(arr, -1);
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        for(int i = 0; i < grid[0].length; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(0);
            temp.add(i);
            temp.add(i);
            q.add(temp);
        }
        while(!q.isEmpty()){
            ArrayList<Integer> n = q.poll();
            if(n.get(0) == grid.length){
                arr[n.get(2)] = n.get(1);
            }
            else{
                int i = n.get(0);
                int j = n.get(1);
                int J = grid[i][j]+j;
                if(J < 0 || J >= grid[0].length);
                else if(grid[i][J] == grid[i][j]) {
                    n.set(0, i+1);
                    n.set(1, J);
                    q.add(n);
                }
            }
        }
        return arr;
    }
}