import java.util.*;

class Solution {
    public int solution(int[] nums) {
//         Map<Integer, Integer> kinds = new HashMap<>();
        
//         // [3,1,2,3] -> 1번 포켓몬 1개, 2번 포켓몬 1개, 3번 포켓몬 2개
//         for (int num : nums) {
//             kinds.put(num, kinds.getOrDefault(num, 0) + 1);
//         }
        
        int answer = 0;
        
        int choice = nums.length / 2;
        Set<Integer> kinds = new HashSet<>();
        for (int num : nums) {
            kinds.add(num);
        }
        
        // 선택할 수 있는 개수 >= 종류의 개수
        // -> 종류의 개수
        // 선택할 수 있는 개수 < 종류의 개수
        // -> 선택할 수 있는 개수
        
        int kindsSize = kinds.size();
        if (choice >= kindsSize)
            return kindsSize;
        
        return choice;
    }
}