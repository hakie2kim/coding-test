import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                answer.add(i);
                n /= i;
            }
                
        }
        
        return answer.stream().distinct().mapToInt(Integer::intValue).toArray();
    }
}