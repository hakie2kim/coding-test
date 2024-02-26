class Solution {
    public int solution(int n) {      
        for (int i = 1; i <= n; i++) {
            // 3의 배수와 숫자 3을 사용하지 않음
            if (String.valueOf(i).contains("3") || i % 3 == 0)
                n++; // if와 같은 조건에서는 다음 숫자를 사용
        }
        
        return n;
    }
}