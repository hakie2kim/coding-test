import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (String intStr : intStrs) {
            if (Integer.parseInt(intStr.substring(s, s + l)) > k)
                answer.add(Integer.parseInt(intStr.substring(s, s + l)));
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}