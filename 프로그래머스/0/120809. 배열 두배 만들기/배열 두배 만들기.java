import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
//         for (int i = 0; i < numbers.length; i++) {
//             numbers[i] *= 2;
//         }
        
//         return numbers;
        return Arrays.stream(numbers).map(elem -> elem * 2).toArray();
    }
}