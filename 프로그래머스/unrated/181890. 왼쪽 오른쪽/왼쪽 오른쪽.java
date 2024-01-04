import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> answerL = new ArrayList<String>();
        
        // 배열을 하나씩 담으면서 
        
        for (int i = 0; i < str_list.length; i++) {
            // l이 나오면 담고 있던 배열을 바로 리턴한다.
            if (str_list[i].equals("l")) {
                return answerL.stream().toArray(String[]::new);       
            }
            answerL.add(str_list[i]);
            
            // r이 나오면 그 다음 인덱스부터 끝까지를 리턴한다.
            if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i+1, str_list.length);
            }    
        }
        
        return new String[]{};
    }
}
