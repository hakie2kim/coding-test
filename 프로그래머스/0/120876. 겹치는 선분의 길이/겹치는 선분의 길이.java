import java.util.*;

class Solution {
    public int solution(int[][] lines) {   
        int answer = 0;
        
        int[] cnters = new int[200]; // -100부터 100까지의 좌표를 나타냄 
        
        for (int[] line : lines) {
            // 1. -100을 나타내는 인덱스는 존재하지 않기에 +100 해줌
            // 2. 점만 겹치는 경우 구간이 겹치는 것이 아니기에 마지막은 cnt에서 제외
            for (int i = line[0]+100; i < line[1]+100; i++) 
                cnters[i]++;
        }
        
        for (int cnter : cnters) {
            if (cnter > 1)
                answer++;
        }
        
        return answer;
    }
}