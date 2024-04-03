class Solution {
    public int solution(int n) {
        // return fibonacci(n) % 1234567;
        
        // 초기 피보나치 수 선언, 할당
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        
        // 이후 피보나치 수 계산
        for (int i = 2; i <= n; i++) {
            nums[i] = (nums[i-2] + nums[i-1]) % 1234567; 
        }
        
        return nums[n];
    }
    
    private int fibonacci(int n) {
        if (n == 2)
            return 0 + 1;
        
        if (n == 1)
            return 1;
        
        if (n == 0)
            return 0;

        return fibonacci(n-2) + fibonacci(n-1);
    }
}