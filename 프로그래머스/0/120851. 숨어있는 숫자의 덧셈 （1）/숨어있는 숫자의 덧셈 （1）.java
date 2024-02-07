import java.util.*;

class Solution {
    public int solution(String my_string) {
        ArrayList<Integer> oneDigNatNums = new ArrayList<>();
        
        for (char letter : my_string.toCharArray()) {
            if ('0' <= letter && letter <= '9')
                oneDigNatNums.add(letter - '0');
        }
        
        return oneDigNatNums.stream().mapToInt(Integer::intValue).sum();
    }
}