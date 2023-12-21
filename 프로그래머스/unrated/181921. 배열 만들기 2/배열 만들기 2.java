import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int num = l; num <= r; num++) { 
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
        for (char numLetter : (num+"").toCharArray()) {
            if ((numLetter - '0') % 5 != 0) {
                return false;
            }  
        }
        return true;
    }
}