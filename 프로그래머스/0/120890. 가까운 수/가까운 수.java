import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int[] distance = new int[array.length];
        
        Arrays.sort(array);
        
        int minIdx = 0;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i] - n) < Math.abs(array[minIdx] - n)) // n과의 거리가 더 작으면 가까운 수의 위치가 변경
                minIdx = i;
        }
        
        return array[minIdx];
    }
}