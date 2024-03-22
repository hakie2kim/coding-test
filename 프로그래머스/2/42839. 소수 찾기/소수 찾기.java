import java.util.*;

class Solution {
    // 조합의 중복을 제거하기 위해 Set 사용
    Set<Integer> numberCombs = new HashSet<>();
    
    private void getComs(String comb, String others) {
        // 1. 현재 조합을 추가
        if (!("".equals(comb)))
            numberCombs.add(Integer.parseInt(comb));
        
        // 2. 남은 숫자 중 하나를 더해 새로운 조합을 만듦
        for (int i = 0; i < others.length(); i++) {
            getComs(comb + others.charAt(i), others.substring(0, i) + others.substring(i+1, others.length()));
        }
    }
    
    private boolean isPrime(int number) {
        // 1 이하의 수는 소수가 아님
        if (number <= 1)
            return false;
        
        for (int n = 2; n <= (int) Math.sqrt(number); n++) {
            if (number % n == 0)
                return false;
        }
        
        return true;
    }
    
    public int solution(String numbers) {
        getComs("", numbers);
        
        int answer = 0;
        for (int number : numberCombs) {
            if (isPrime(number))
                answer++;
        }
        
        return answer;
    }
}