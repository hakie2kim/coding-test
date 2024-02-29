import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int a, int b) {      
        int gcd = getGcdByEuclidsAlgorithm(a, b);
        int bDividedByGcd = b / gcd;

        // 소인수가 2, 5만 있는지 확인
        // 소인수 2, 5가 아닌 경우 2 리턴 
        while (bDividedByGcd != 1) {
            if (bDividedByGcd % 2 == 0) {
                bDividedByGcd /= 2;
            } else if (bDividedByGcd % 5 == 0) {
                bDividedByGcd /= 5;
            } else {
                return 2;
            }
        }
        
        return 1;
    }
    
    // 최대공약수 구하기
    int getGcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) 
            return n1;
    
        return getGcdByEuclidsAlgorithm(n2, n1 % n2);
    }
    
    // 소인수를 List 형태로 갖고 오기
//     List<Integer> getPrimeFactors(int n) {
//         List<Integer> primeFactors = new ArrayList<>();
        
//         for (int i = 2; i <= n; i++) {
//             if (n % i == 0) {
//                 while (n % i == 0) {
//                     n /= i;
//                 }
            
//                 primeFactors.add(i);                
//             }
//         }
        
//         return primeFactors;
//     } 
}
