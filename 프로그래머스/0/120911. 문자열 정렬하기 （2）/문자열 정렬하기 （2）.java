import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] my_str_to_char_arr = my_string.toLowerCase().toCharArray(); // 모두 소문자로 바꿈, 정렬 위해 char 배열로 변경
        Arrays.sort(my_str_to_char_arr); // 알파벳 순으로 정렬
        return new String(my_str_to_char_arr);
    }
}
