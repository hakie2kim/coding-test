class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 1. 최대공약수를 구하지 않고 분수 계산을 함
        int denom = denom1 * denom2;
        int numer = numer1 * denom2 + numer2 * denom1;
        
        // 2. 최대공약수를 구함
        int gcd = getGcd(Math.max(denom, numer), Math.min(denom, numer));
        
        // 3. 분모, 분자를 최대공약수로 나눔
        return new int[]{numer / gcd, denom / gcd};
    }
    
    // a   b  a%b
    // 106 16 10
    // 16  10 6
    // 10  6  4
    // 6   4  2
    // 4   2  0
    // 2   0  2  -> return하는 경우
    
    // 최대공약수 구하는 함수 (유클리드 호제법)
    private int getGcd(int a, int b) {
        if (b == 0) 
            return a;
        
        return getGcd(b, a % b);
    }
    
    private int getLcm(int a, int b) {
	    // 최소 공배수 = a * b / 최대 공약수
	    return a * b / getGcd(a, b);
    }
}