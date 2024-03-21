class Solution {
    // 약수의 개수 구하는 메서드
    private int getFactorCnt(int num) {
        int cnt = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                cnt++;
        }
        
        return cnt;
    }
    
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int n = left; n <= right; n++) {
            if (getFactorCnt(n) % 2 == 0) // 약수의 개수가 짝수인 경우
                answer += n;
            else // 약수의 개수가 홀수인 경우
                answer -= n;
        }
            
            
        return answer;
    }
}