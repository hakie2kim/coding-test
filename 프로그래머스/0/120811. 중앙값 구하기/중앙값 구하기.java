import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        // System.out.println(Arrays.toString(array));
        return array[array.length / 2]; // 가운데 값 찾기
    }
}