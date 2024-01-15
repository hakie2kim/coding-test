import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            int curElem = arr[i];
            
            if (!result.contains(curElem))
                result.add(curElem);
            
            if (result.size() == k)
                break;
        }
        
        // 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채움
        while (result.size() != k) {
            result.add(-1);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}