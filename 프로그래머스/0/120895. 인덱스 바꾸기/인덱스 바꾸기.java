class Solution {
    public String solution(String my_string, int num1, int num2) {        
        char[] my_str_to_char_arr = my_string.toCharArray();
        
        char temp = my_str_to_char_arr[num1];
        my_str_to_char_arr[num1] = my_str_to_char_arr[num2];
        my_str_to_char_arr[num2] = temp;
        
        return new String(my_str_to_char_arr);
    }
}