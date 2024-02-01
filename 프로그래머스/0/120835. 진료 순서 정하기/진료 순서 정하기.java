import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] result = new int[emergency.length];
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) 
                    result[i]++; // 자신보다 응급도가 높은 경우 자신의 우선 순위는 뒤로 밀려남
            }
            result[i]++; // 우선 순위는 1부터 시작
        }
        
        return result;
    }
}