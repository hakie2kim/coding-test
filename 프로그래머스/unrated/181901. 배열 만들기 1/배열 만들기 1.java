import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 1; i <= n / k; i++) {
            answer.add(i * k);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}