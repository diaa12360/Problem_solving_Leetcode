class Solution {
    public int singleNumber(int[] nums) {
        int arr[] = new int[(3 * 10000)];
        int arrn[] = new int[(3 * 10000)];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0)
                arrn[-nums[i]]++;
            else
                arr[nums[i]]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                return i;
            }
        }
        for(int i = 0; i < arrn.length; i++){
            if(arrn[i] == 1)
                return -i;
        }
        return -1;
    }
}