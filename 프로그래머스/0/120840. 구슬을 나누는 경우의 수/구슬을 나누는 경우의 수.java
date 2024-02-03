import java.util.stream.*;
import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        return factorial(balls).divide(factorial(balls-share)).divide(factorial(share)); 
    }
    
    public BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}