import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // 최대한 많은 부서에 물품을 지원
        // -> 필요 금액이 적은 부서부터 지원
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            if (budget < d[i]) // 필요 금액이 잔여 예산보다 큰 경우
                break;
            else {
                budget -= d[i];
                answer++;
            }
        }
        
        return answer;
    }
}