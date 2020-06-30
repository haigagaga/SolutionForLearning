package Leetcode;

import java.util.*;

public class 无重复字符的最长子串 {

    public static void main(String[] args) {
        //pwwkew
        int num = new 无重复字符的最长子串().lengthOfLongestSubstring("pwwkew");
        System.out.println(num);
    }

    public int lengthOfLongestSubstring(String s) {
//
//        Queue<Character> characters = new LinkedList<>();
//        int max = 0;
//        for (char e :
//                s.toCharArray()) {
//            while(characters.contains(e)){
//                characters.poll();
//            }
//            characters.add(e);
//            max = Math.max(max,characters.size());
//        }
//        return max;

        //map和两个指针，构造出滑动框   pwewkew
        Map<Character, Integer> maps = new HashMap<>();
        String result = "";
        int j = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (maps.containsKey(s.charAt(i))) {
                j = Math.max(j, maps.get(s.charAt(i))+1);
            }
            maps.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}
