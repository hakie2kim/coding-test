import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] my_str_splitted = my_string.split("[^0-9]+");
        // System.out.println(Arrays.toString(my_str_splitted));
        
        int answer = 0;
        
        for (String my_str : my_str_splitted) {
            if (!my_str.isEmpty()) // 빈 문자열 제외
                answer += Integer.parseInt(my_str);
        }
        
        return answer;
    }
}