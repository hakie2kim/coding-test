import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int[] distance = new int[array.length];
        
        Arrays.sort(array); // 가장 가까운 수가 여러 개일 경우 더 작은 수를 return
        
        int minIdx = 0;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i] - n) < Math.abs(array[minIdx] - n)) // n과의 거리가 더 작으면 가까운 수의 위치가 변경
                minIdx = i;
        }
        
        return array[minIdx];
    }
}