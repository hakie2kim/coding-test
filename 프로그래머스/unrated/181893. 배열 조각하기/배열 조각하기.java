import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) // 짝수 인덱스
                arr = Arrays.copyOfRange(arr, 0, query[i]+1); // 배열의 query[i]번 인덱스 뒷부분을 잘라서 버림
            else // 홀수 인덱스
                arr = Arrays.copyOfRange(arr, query[i], arr.length); // 배열의 query[i]번 인덱스 앞부분을 잘라서 버림
        }
        
        return arr;
    }
}