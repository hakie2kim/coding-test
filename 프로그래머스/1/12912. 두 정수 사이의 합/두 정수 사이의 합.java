class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        // a, b 중 작은 것
        int start = a > b ? b : a;
        // a, b 중 큰 것
        int end = a > b ? a : b;
        
        for (int n = start; n <= end; n++) {
            answer += n;
        }
        
        return answer;
    }
}