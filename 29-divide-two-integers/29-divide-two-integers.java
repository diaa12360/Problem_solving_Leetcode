class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){ 
            return Integer.MAX_VALUE;
        }
    
        if(dividend == Integer.MIN_VALUE && divisor == 1){ 
            return Integer.MIN_VALUE;
        }
        boolean check = (dividend < 0) ^ (divisor < 0);
        long x = Math.abs((long) dividend);
        long y = Math.abs((long) divisor);
        int count = 0;
        if(divisor==1){                              
            return dividend;
        }
        if(divisor==-1){                            
            return dividend*-1;
        }
    
        if(x == y){     
            if(check)
                return -1;
            else
                return 1;
        }
        for(int i = 31; i >= 0; i--){
            if((y << i) <= x){
                x -= (y << i);
                count += (1 << i);
            }
        }
        return check ? -count : count;
    }
}