import java.util.*;

class Solution {
    public long solution(long n) {
        // 1. 숫자를 char 배열로 만든 후 정렬
        char[] nArr = (n+"").toCharArray();
        Arrays.sort(nArr);
        // 2. 숫자를 역정렬 후 long으로 변환
        StringBuilder nsb = new StringBuilder(new String(nArr));
        return Long.parseLong(nsb.reverse().toString());
    }
}