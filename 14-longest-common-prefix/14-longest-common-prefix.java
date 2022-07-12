class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int size = 200;
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < size)
                size = strs[i].length();
        }
        boolean x = false;
        for(int i = 0; i < size; i++){
        char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(strs[j].charAt(i) == c);
                else {
                    x = true;
                    break;
                }
            }
            if(x) break;
            else result.append(c);
        }
        return result.toString();
    }
}