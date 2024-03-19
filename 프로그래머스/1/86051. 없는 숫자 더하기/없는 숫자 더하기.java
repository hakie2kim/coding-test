import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // 0부터 9까지의 합
        int zeroToNineTotal = 9 * (9 + 1) / 2;
        
        // 제외할 numbers의 총 합
        int excludeTotal = 0;
        for (int i = 0; i < numbers.length; i++) {
            excludeTotal += numbers[i];
        }
        
        return zeroToNineTotal - excludeTotal;
    }
}