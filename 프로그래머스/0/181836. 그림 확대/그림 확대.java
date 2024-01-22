import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> answer = new ArrayList<String>();
        
        for (String row : picture) { // ".xx...xx."
            StringBuilder sb = new StringBuilder("");
            
            for (char letter : row.toCharArray()) {
                for (int time = 1; time <= k; time++) { // "..xxxx......xxxx.."
                    sb.append(letter);
                }
            }
            
            for (int time = 1; time <= k; time++) { // "..xxxx......xxxx.." * k
                answer.add(sb.toString());
            }            
        }
        
        return answer.stream().toArray(String[]::new);
    }
}