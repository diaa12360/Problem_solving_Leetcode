class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int x: nums)
            sum += x;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(2 * count == sum - nums[i]) return i;
            count += nums[i];
        }
        return -1;
    }
}