import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int answer = 0;
        
        // sides에 주어진 변 중 하나가 가장 긴 경우
        int s = sides[1] - sides[0] + 1;
        while(sides[0] + s > sides[1] && s <= sides[1]) {
            answer++;
            s++;
        }
        
        // 새로운 변이 가장 긴 변인 경우
        s = sides[1] + 1;
        while (sides[0] + sides[1] > s) {
            answer++;
            s++;
        }
        
        return answer;
    }
}