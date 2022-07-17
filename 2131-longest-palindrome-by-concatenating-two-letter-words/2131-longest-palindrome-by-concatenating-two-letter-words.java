class Solution {
    private String revers(String s){
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = chars.length - 1; i >= 0; i--){
            str.append(chars[i]);
        }
        return str.toString();
    }
    
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> mp = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            if(mp.containsKey(words[i])){
                mp.put(words[i], mp.get(words[i]) + 1);
            }
            else{
                mp.put(words[i], 1);
            }
        }
        int result = 0;
        for(String s: mp.keySet()){
            String r = revers(s);
            if(mp.containsKey(r)){
                if(r.equals(s)){
                    if(mp.get(r) % 2 == 0){
                        result += (mp.get(s) * 2);
                        mp.put(s, 0);
                    }
                    else{
                        result += ((mp.get(s) - 1) * 2);
                        mp.put(s, 1);
                    }
                }
                else{
                
                    result += 4* Math.min(mp.get(s),mp.get(r));
                    mp.put(s,0);
                    mp.put(r,0);
                }
            }
        }
        for(String s: mp.keySet()){
            if(s.charAt(0) == s.charAt(1) && mp.get(s) > 0){
                result += 2;
                break;
            }
        }
        return result;
    }
}