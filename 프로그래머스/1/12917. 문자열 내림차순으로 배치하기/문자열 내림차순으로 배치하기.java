import java.util.*;

class Solution {
    public String solution(String s) {
        // 1.
        String[] sArr = s.split("");
        Arrays.sort(sArr, Collections.reverseOrder());
        return String.join("", sArr);
        
        // 2.
        // return s.split("").sort().reverse().join("");
    }
}