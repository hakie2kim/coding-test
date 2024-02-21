import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
//         풀이1
//         int answer = 0;
        
//         for (int num : array) {
//             if (num == n)
//                 answer++;
//         }
        
//         return answer;
        
        // 풀이2
        return (int) Arrays.stream(array).filter(i -> i==n).count();
    }
}