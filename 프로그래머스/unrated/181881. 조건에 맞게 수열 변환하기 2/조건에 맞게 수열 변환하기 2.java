import java.util.*;

class Solution {
    public int solution(int[] arr) {        
        int repeat = 0;
        
        while (true) {
            int[] arrBefore = Arrays.copyOf(arr, arr.length);
            
            // 문제의 arr 바꾸는 과정
            for (int i = 0; i <= arr.length-1; i++) {
                if (arr[i] >= 50 && (arr[i] % 2 == 0)) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && (arr[i] % 2 != 0)) {
                    arr[i] *= 2;
                    arr[i] += 1;
                }
            }
            
            // 변경 전 arrBefore와 변경 후 arr가 같으면 while을 벗어남
            // 그렇지 않으면 다시 반복함
            if (Arrays.equals(arrBefore, arr)) {
                break;
            }
            
            repeat++;
        }
        
        return repeat;
    }
}
