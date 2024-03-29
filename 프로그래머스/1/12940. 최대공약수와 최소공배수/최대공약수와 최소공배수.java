class Solution {
    private static int n;
    private static int m;
    
    public int[] solution(int n, int m) {
        this.n = n;
        this.m = m;
        
        return new int[]{gcdByBruteForce(), lcm()};
    }
    
    // 최대공약수 구하기
    private static int gcdByBruteForce() {
        int gcd = 1;
        
        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        
        return gcd;
    }
    
    // 최소공배수 구하기
    private static int lcm() {
        if (n == 0 || m == 0)
            return 0;
        else {
            int gcd = gcdByBruteForce();
            return Math.abs(n * m) / gcd;
        }
    }
}