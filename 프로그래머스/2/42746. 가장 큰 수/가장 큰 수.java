import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] strNumbers = new String[numbers.length];
        
        // numbers를 문자열 형태로 변환
        int i = 0;
        for (int number : numbers) {
            strNumbers[i++] = String.valueOf(number);
        }
        
        // 문자열 조합을 비교해 역순으로 정렬
        Arrays.sort(strNumbers, (str1, str2) -> (str1 + str2).compareTo(str2 + str1) * -1);
        
        if (strNumbers[0].equals("0"))
            return "0";
        
        StringBuilder answer = new StringBuilder();
        for (String strNumber : strNumbers) {
            answer.append(strNumber);
        }
        
        return answer.toString();
    }
}