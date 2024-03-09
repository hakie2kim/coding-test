import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> answer = new Stack<>();
        
        for (int elem : arr) {
            if (answer.size() == 0) // 처음 원소는 무조건 추가
                answer.push(elem);
            
            // stack에서 elem이 이미 추가돼 있으면 다음 원소로 넘어감
            if (answer.peek() == elem) 
                continue;
            else
                answer.push(elem);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}