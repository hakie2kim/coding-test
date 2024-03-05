import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] befCharArr = before.toCharArray();
        char[] aftCharArr = after.toCharArray();
        
        // 정렬 후 두 char 배열의 알파벳 종류와 개수는 같아야 함
        Arrays.sort(befCharArr);
        Arrays.sort(aftCharArr);
        
        before = new String(befCharArr);
        after = new String(aftCharArr);
        
        return before.equals(after) ? 1 : 0;
    }
}