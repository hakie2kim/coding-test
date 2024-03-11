import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while (n != 0) {
            answer += n % 10; // 첫째자리부터 각 자리를 더함
            n /= 10; // 더한 자리는 몫으로 대체
        }
        
        return answer;
    }
}