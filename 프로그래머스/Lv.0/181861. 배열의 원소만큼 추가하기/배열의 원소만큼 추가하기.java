import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for (int num : arr) {
            for (int i = 1; i <= num; i++) {
                answer.add(num);
            }
        }
        
        return answer.stream().mapToInt(Integer::new).toArray();
    }
}