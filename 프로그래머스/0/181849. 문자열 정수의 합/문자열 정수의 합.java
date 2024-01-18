class Solution {
    public int solution(String num_str) {
        int total = 0;
        
        for (char num : num_str.toCharArray()) {
            total += num - '0';
        }
        
        return total;
    }
}