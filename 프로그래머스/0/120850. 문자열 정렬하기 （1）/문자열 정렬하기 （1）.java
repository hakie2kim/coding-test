import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        
        for (char letter : my_string.toCharArray()) {
            if ('0' <= letter && letter <= '9')
                answer.add(letter - '0');
        }
        
        Collections.sort(answer);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}