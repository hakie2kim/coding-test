class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase()); // 'a' = 97, 'A' = 65
    }
}