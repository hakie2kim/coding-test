class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 2부터 n-1까지 x에 대해
        for (int x = 2; x < n; x++) {
            if (n % x == 1) { // 나머지가 1인 경우
                answer = x;
                break;
            }
        }
        
        return answer;
    }
}