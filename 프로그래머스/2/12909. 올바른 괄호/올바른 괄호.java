import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '(')
                stack.push(bracket);
            else { // ')'인 경우 
                if (stack.isEmpty()) // 비어 있는 경우 여는 괄호가 없기 때문에 false
                    return false;
                
                stack.pop(); // 한 쌍 검증
            }
                
        }

        return stack.isEmpty(); // 스택이 비어있는 경우 = 쌍이 모두 충족
    }
}