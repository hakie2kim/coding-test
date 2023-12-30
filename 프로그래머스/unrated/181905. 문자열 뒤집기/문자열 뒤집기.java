class Solution {
    public String solution(String my_string, int s, int e) {
        char[] my_string_charArr = my_string.toCharArray();
        for (int i = s, j = e; i < j; i++, j--) {
            char tmp = my_string_charArr[i];
            my_string_charArr[i] = my_string_charArr[j];
            my_string_charArr[j] = tmp;
        }
        return new String(my_string_charArr);
    }
}