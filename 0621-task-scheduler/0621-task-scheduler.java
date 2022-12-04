class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int max = 0, count = 0;
        for(int i = 0; i < tasks.length; i++){
            mp.put(tasks[i], mp.getOrDefault(tasks[i], 0) + 1);
            if(max == mp.get(tasks[i]))
                count++;
            else if(max < mp.get(tasks[i])){
                max = mp.get(tasks[i]);
                count = 1;
            }
        }
        return tasks.length + 
            Math.max(0, ((max - 1) * (n - (count - 1))) - (tasks.length - max * count));
    }
}
