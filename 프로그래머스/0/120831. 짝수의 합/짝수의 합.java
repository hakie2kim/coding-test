class Solution {
    public int solution(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n / 2; i++) { // n/2는 몇 번째 짝수를 의미
            sum += 2 * i;
        }
        
        return sum;
        
        // return IntStream(0, n).filter(num -> num % 2 == 0).sum();
    }
}