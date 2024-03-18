class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while (num != 1) {
            if (num % 2 == 0) // 주어진 수가 짝수라면
                num /= 2;
            else // 주어진 수가 홀수라면
                num = num * 3 + 1;
            
            answer++;
                
            if (answer == 500) // 500번을 시도해도 1이 되지 못하면
                break;
        }
        
        return (answer == 500) ? -1 : answer;
    }
}