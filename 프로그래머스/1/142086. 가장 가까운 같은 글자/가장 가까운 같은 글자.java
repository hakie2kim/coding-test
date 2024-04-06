import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        char[] sArr = s.toCharArray();
        for (int i = sArr.length-1; i >= 0; i--) {
            answer[i] = -1; // 자신과 같은 글자가 가까운 곳에 없으면
            
            for (int j = i-1; j >= 0; j--) {
                if (sArr[i] == sArr[j]) { // 기준 글자에 대해 자신과 같은 글자가 가까운 곳에 있으면
                    answer[i] = i-j; // 거리를 구하고 저장
                    break;
                }
            }
        }
        
        // Map<Character, Integer> alphaIdx = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     // 만약 ch가 존재하지 않는 경우 i-i-1: -1
        //     answer[i] = i - alphaIdx.getOrDefault(ch, i+1);
        //     alphaIdx.put(ch, i);
        // }
        
        return answer;
    }
}