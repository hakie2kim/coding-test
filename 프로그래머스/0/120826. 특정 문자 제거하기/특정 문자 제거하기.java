class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        
        for (char my_str_letter : my_string.toCharArray()) {
            if (my_str_letter - letter.charAt(0) != 0) // letter와 my_string의 각 char이 일치하지 않는다면
                sb.append(my_str_letter);
        }
        
        return sb.toString();
    }
}