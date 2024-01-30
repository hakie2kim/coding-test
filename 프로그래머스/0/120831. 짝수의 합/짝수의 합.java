import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int sum = 0;
        
        // for (int i = 1; i <= n / 2; i++) { // n/2는 몇 번째 짝수를 의미
        //     sum += 2 * i;
        // }
        
        for (int i = 2; i <= n; i+=2) { 
            sum += i;
        }
        
        return sum;
        
        // return IntStream.rangeClosed(0, n).filter(num -> num % 2 == 0).sum();
    }
}