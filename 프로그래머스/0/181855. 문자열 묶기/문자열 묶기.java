import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int[] elemLengthCounter = new int[31]; // 1 ≤ strArr의 원소의 길이 ≤ 30, 인덱스 0의 원소는 아무 역할도 안 함
        
        for (String str : strArr) {
            elemLengthCounter[str.length()]++; // strArr의 원소의 길이와 일치하는 인덱스를 1 증가
        }
        
        int maxIndex = 1; // 가장 큰 값의 인덱스를 저장할 변수를 초기화합니다.
        for (int i = 2; i < elemLengthCounter.length; i++) {
            // 인덱스의 최대값을 구하는 것이기에 =를 붙여줘야 한다.
            if (elemLengthCounter[i] >= elemLengthCounter[maxIndex]) {
                maxIndex = i; // 현재의 값이 현재까지의 최댓값보다 크거나 같다면 인덱스를 업데이트합니다.
            }
        }
        
        return elemLengthCounter[maxIndex];
    }
}