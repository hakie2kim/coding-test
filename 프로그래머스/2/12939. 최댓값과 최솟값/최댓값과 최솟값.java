import java.util.*;

class Solution {
    public String solution(String s) {
        // 1. 주어진 s를 정수화한 배열 만들기
        String[] sArr = s.split(" ");
        int[] sNumArr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            sNumArr[i] = Integer.parseInt(sArr[i]);
        }
        
        // 2. 배열 정렬
        Arrays.sort(sNumArr);
        
        // 3. "(최소값) (최대값)"형태의 문자열을 반환
        return sNumArr[0] + " " + sNumArr[sNumArr.length-1];
    }
}