import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        if (l % 5 != 0) {
            l = (l / 5 + 1) * 5;
        }
        
        for (int num = l; num <= r; num += 5) {            
            if (checkNumber(num)) {
                answer.add(num);
            } 
        }

        if (answer.isEmpty()) {
            answer.add(-1);
        } 
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private boolean checkNumber(int num) {
        for (char numLetter : String.valueOf(num).toCharArray()) {
            if ((numLetter - '0') % 5 != 0) {
                return false;
            }  
        }
        return true;
    }
}