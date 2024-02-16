class Solution {
    public int solution(String my_string) {
        String[] my_str_splitted = my_string.split(" ");
        
        int answer = Integer.parseInt(my_str_splitted[0]);
        
        for (int i = 1; i < my_str_splitted.length; i+=2) {
            switch(my_str_splitted[i]) {
                case "+":
                    answer += Integer.parseInt(my_str_splitted[i+1]);
                    break;
                case "-":
                    answer -= Integer.parseInt(my_str_splitted[i+1]);
                    break;
            }            
        }

        return answer;
    }
}