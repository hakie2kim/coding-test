import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        
        // arr의 길이가 1인 경우 리턴하려는 배열은 빈 배열 -> -1을 채워 리턴
        if (arr.length == 1)
            return new int[]{-1};
        
        // arr 중 최솟값을 찾기 위한 과정
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        // 최솟값을 제외한 나머지 원소로 초기화
        answer = new int[arr.length - 1];
        int i = 0;
        for (int num : arr) {
            if (num == min)
                continue;
            
            answer[i++] = num;
        }
        
        return answer;
    }
}