import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        // 가장 큰 수 구하기
        int[] copyOfArr = Arrays.copyOf(array, array.length);
        Arrays.sort(copyOfArr);
        int maxNum = copyOfArr[copyOfArr.length-1];
        
        // 가장 큰 수의 인덱스 구하기
        int maxNumIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNum) {
                maxNumIdx = i;
                break;
            }
        }
        
        return new int[]{maxNum, maxNumIdx};
        
        // int max = 0;
        // int maxIndex = 0;
        // for (int i = 0; i < array.length; i++) {
        //     if (max < array[i]) {
        //         max = array[i];
        //         maxIndex = i;
        //     }
        // }
        // int[] answer = {max, maxIndex};
        // return answer;
    }
}