class Solution {
    public int solution(String my_string, String target) {
        // return my_string.indexOf(target) == -1 ? 0 : 1;
        return my_string.contains(target) ? 1 : 0;
    }
}