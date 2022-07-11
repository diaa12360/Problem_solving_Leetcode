import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("IV", 4);
        map.put("I", 1);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        char[] arr = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && map.get(arr[i] + "") < map.get(arr[i + 1] + "")) {
                sum += map.get(arr[i + 1] + "") - map.get(arr[i] + "");
                i++;
            } else
                sum += map.get(arr[i] + "");
        }
        return sum;        
    }
}
