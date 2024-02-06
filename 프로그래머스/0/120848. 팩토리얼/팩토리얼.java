class Solution {
    public int solution(int n) {
        int i;
        
        for (i = 1; i <= 10; i++) { // 10! = 3628800
            if (factorial(i) > n) {
                break;   
            }      
        }

        return i - 1; // factorial(i) > n을 만족하는 i보다 하나 작은 정수
    }
    
    private long factorial(int n) {
        if (n <= 2)
            return n;
        
        return n * factorial(n - 1);
    }
}