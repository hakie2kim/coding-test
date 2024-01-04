import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> answer = new ArrayList<String>();
        
        for (int i = 0; i < names.length; i+= 5) {
            answer.add(names[i]);
        } 
        
        return answer.stream().toArray(String[]::new);
    }
}