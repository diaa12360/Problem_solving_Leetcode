class Solution {
    HashSet<Integer> set = new HashSet<>();
    public boolean isHappy(int n) {
        int i = 0;
        while(n != 0){
            i += (n%10) * (n%10);
            n /= 10;
        }
        if(i == 1)
            return true;
        if(set.contains(i))
            return false;
        set.add(i);
        return isHappy(i);
    }
}