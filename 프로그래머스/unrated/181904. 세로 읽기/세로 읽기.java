class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder("");
        
        // c가 2면 읽어야 하는 인덱스: 1, 5, 9, ...
        // => 4 (= m)로 나눈 나머지가 1 (= c-1)인 인덱스
        
        for (int i = 0; i < my_string.length(); i++) {
            if (i % m == c-1)
                answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
}