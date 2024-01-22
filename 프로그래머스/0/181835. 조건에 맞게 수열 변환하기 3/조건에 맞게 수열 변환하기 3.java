import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        // 향상된 for문은 일반적인 for문과 달리 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용할 수 있다는 제약 있음
//         for (int i = 0; i < arr.length; i++) {
//             if (k % 2 == 0) {
//                 arr[i] += k;    
//             } else {
//                 arr[i] *= k;
//             }
//         }
        
//         return arr;
        return Arrays.stream(arr).map(elem -> (k % 2 == 0) ? elem + k : elem * k).toArray();
    }
}