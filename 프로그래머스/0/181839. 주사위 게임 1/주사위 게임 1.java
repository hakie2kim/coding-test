class Solution {
    public int solution(int a, int b) {
        int result = 0;
        
        if (a % 2 == 1 && b % 2 == 1) {
        // 모두 홀수
            result = a * a + b * b;
        } else if (a % 2 == 0 && b % 2 == 0) {
        // 모두 홀수가 아니라면 = 모두 짝수라면
            result = Math.abs(a - b);
        } else { 
        // 하나만 홀수
            result = 2 * (a + b);
        }

        return result;
    }
}