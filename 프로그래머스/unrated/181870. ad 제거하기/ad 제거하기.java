import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<String>();
        
        for (String str : strArr) {
            if (str.indexOf("ad") == -1) // 부분 문자열로 "ad"가 없는 경우
                answer.add(str);
        }
        
        return answer.toArray(String[]::new);
    }
}