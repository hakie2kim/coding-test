import java.util.*;

class Solution {
    public List solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        
        for (int n : arr) {
            if (n % divisor == 0)
                answer.add(n);
        }
        
        // 배열이 빈 경우 -1을 담음
        if (answer.isEmpty())
            answer.add(-1);
        
        // 오름차순 정렬
        Collections.sort(answer);
        
        return answer;
    }
}