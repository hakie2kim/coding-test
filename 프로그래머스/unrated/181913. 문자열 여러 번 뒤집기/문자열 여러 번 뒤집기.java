class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] string = my_string.toCharArray();
        
        for (int[] query : queries) {
            for (int i = query[0], j = query[1]; i < j; i++, j--) { 
                char tmp = string[i];
                string[i] = string[j];
                string[j] = tmp; 
            }
        }
        
        return String.valueOf(string);
    }
}