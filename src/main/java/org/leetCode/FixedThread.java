package org.leetCode;

import java.util.HashMap;
import java.util.Map;

public class FixedThread {

    public static void main(String[] args) {
        String s = "jasgfjdfdsFWEFWEfwefbhdgfjsgafjwf";
        String lower = s.toLowerCase();
        Map<String, Integer> count = new HashMap<>();

        for (char c : lower.toCharArray()) {
            count.put(String.valueOf(c), count.getOrDefault(String.valueOf(c), 0) + 1);

        }
        
        System.out.println(count);
    }
}
