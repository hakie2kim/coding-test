import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for (char letter : my_string.toCharArray()) {
            if (sb.indexOf(letter+"") == -1) // 이미 포함돼 있지 않으면 글자 추가
                sb.append(letter);
        }
        
        return sb.toString();
    }
}