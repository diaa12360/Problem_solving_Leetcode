class Solution {
    public int reverse(int x) {
        StringBuilder result = new StringBuilder();
        boolean isNegative = x < 0;
        if(isNegative)
            x = -x;
        char[] arr = String.valueOf(x).toCharArray();
        for(int i = arr.length - 1; i >= 0; i--){
            result.append(arr[i]);
        }
        int r;
        try{
            r = Integer.parseInt(result.toString());
        }
        catch(Exception e){
            return 0;
        }
        return (isNegative ? -r : r);
    }
}
