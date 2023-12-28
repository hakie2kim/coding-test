class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] string = my_string.toCharArray();
        
        for (int[] query : queries) {
            // 합이 일정한 인덱스끼리 서로 자리 바꿈을 반복
            // 예) (0, 7), (1, 6), (2, 5), ...
            for (int i = query[0], j = query[1]; i <= j; i++, j--) { 
                char tmp = string[i];
                string[i] = string[j];
                string[j] = tmp; 
            }
        }
        
        return String.valueOf(string);
    }
}