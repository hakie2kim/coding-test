import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < answer.length; i++) {
            // 1. commands[i][0]번째부터 commands[i][1]까지 자름
            // copyOfRange는 마지막 인자 -1까지 포함
            int[] partialArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            // 2. 정렬
            Arrays.sort(partialArr);
            // 3. commands[i][2]번째 숫자
            answer[i] = partialArr[commands[i][2] - 1];
        }
        
        return answer;
    }
}